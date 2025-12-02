package patternComparison.strategyVsState;

import patternComparison.strategyVsState.strategy.*;
import patternComparison.strategyVsState.state.*;

public class StrategyVsState {

    public static void demonstrateStrategy() {
        System.out.println("=== STRATEGY PATTERN: Encapsulating Algorithms ===\n");

        FileCompressorContext compressor = new FileCompressorContext();
        String file = "document.txt";

        System.out.println("-- Using Strategy Pattern to compress a file with different, interchangeable algorithms --");

        // Algorithm changes independently of client
        System.out.println("Scenario 1: Small file, need speed, using Lz4CompressionStrategy...");
        compressor.setStrategy(new Lz4CompressionStrategy());
        compressor.compressFile(file);

        System.out.println("\nScenario 2: Large file, need compression ratio, using RarCompressionStrategy...");
        compressor.setStrategy(new RarCompressionStrategy());
        compressor.compressFile(file);

        System.out.println("\nScenario 3: Standard compression, using ZipCompressionStrategy...");
        compressor.setStrategy(new ZipCompressionStrategy());
        compressor.compressFile(file);

        System.out.println("\n✓ Algorithms change independently");
        System.out.println("✓ Client code unchanged");
        System.out.println("✓ Easy to add new compression algorithms");
    }

    public static void demonstrateState() {
        System.out.println("\n=== STATE PATTERN: State-Dependent Behavior ===\n");

        OrderContext order1 = new OrderContext("ORD001");

        System.out.println("-- Using State Pattern to process an order based on its state (i.e. PENDING, PROCESSING, SHIPPED, etc.) --");

        System.out.println("Order lifecycle:");
        System.out.println(">>> Initial Order State: " + order1.getState());
        order1.process(); // PENDING -> PROCESSING
        System.out.println(">>> Order State: " + order1.getState());
        order1.process(); // PROCESSING -> SHIPPED
        System.out.println(">>> Order State: " + order1.getState());
        order1.cancel(); // Try to cancel (not allowed when shipped)
        System.out.println(">>> Order State: " + order1.getState());
        order1.process(); // SHIPPED -> DELIVERED
        System.out.println(">>> Final Order State: " + order1.getState());

        System.out.println("\nDifferent order path:");
        OrderContext order2 = new OrderContext("ORD002");
        System.out.println(">>> Initial Order State: " + order2.getState());
        order2.cancel(); // PENDING -> CANCELLED
        System.out.println(">>> Order State: " + order2.getState());
        order2.process(); // Try to process (not allowed when cancelled)
        System.out.println(">>> Final Order State: " + order2.getState());

        System.out.println("\n✓ Behavior changes based on state");
        System.out.println("✓ State transitions encapsulated");
        System.out.println("✓ Eliminates complex conditional logic");
    }

    public static void compareEncapsulation() {
        System.out.println("\n=== ENCAPSULATION COMPARISON ===\n");

        System.out.println("STRATEGY PATTERN:");
        System.out.println("- Encapsulates ALGORITHMS (how to do something)");
        System.out.println("- Algorithm can change without affecting client");
        System.out.println("- Client chooses which algorithm to use");
        System.out.println("- Example: Different sorting algorithms, compression methods");

        System.out.println("\nSTATE PATTERN:");
        System.out.println("- Encapsulates STATE-DEPENDENT BEHAVIOR (what to do based on state)");
        System.out.println("- Behavior changes automatically with state transitions");
        System.out.println("- Object manages its own state transitions");
        System.out.println("- Example: Order processing, document workflow, TCP connection");
    }

    public static void compareFlexibility() {
        System.out.println("\n=== FLEXIBILITY & EXTENSIBILITY ===\n");

        System.out.println("STRATEGY - Composition over Inheritance:");
        System.out.println("✓ Add new algorithms without modifying existing code");
        System.out.println("✓ Switch algorithms at runtime");
        System.out.println("✓ No inheritance hierarchy needed");
        System.out.println("✓ Follows Open/Closed Principle");

        System.out.println("\nSTATE - Composition over Inheritance:");
        System.out.println("✓ Add new states without modifying existing states");
        System.out.println("✓ State transitions are explicit and traceable");
        System.out.println("✓ No complex conditional logic in context");
        System.out.println("✓ Each state is independently testable");

        System.out.println("\nBoth patterns favor COMPOSITION over INHERITANCE");
        System.out.println("This provides superior flexibility compared to Template Method");
    }

    public static void main(String[] args) {
        demonstrateStrategy();
        demonstrateState();
        compareEncapsulation();
        compareFlexibility();
    }
}

