package behavioralDesignPatterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Demo ===");

        Context context = new Context(new ConcreteStrategyA());
        context.displayCurrentStrategy();

        System.out.println("Changing strategy at runtime...");
        context.setStrategy(new ConcreteStrategyB());
        context.displayCurrentStrategy();

        System.out.println("→ Demo completed: Strategy pattern allows behavior change via composition.");
    }
}