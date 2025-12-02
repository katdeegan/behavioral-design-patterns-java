package patternComparison.observerVsCommand;

import patternComparison.observerVsCommand.observer.*;
import patternComparison.observerVsCommand.command.*;

public class ObserverVsCommand {

    public static void demonstrateObserver() {
        System.out.println("=== OBSERVER PATTERN: Dynamic Decoupling of Subject and Observers ==\n");

        StockMarket market = new StockMarket();
        String stock1 = "STOCK1";

        // Create observers all adhering to IStockObserver interface
        IStockObserver trader1 = new TraderObserver("Katherine");
        IStockObserver trader2 = new TraderObserver("Yifei");
        IStockObserver portfolio = new PortfolioObserver();

        // Dynamic attachment
        System.out.printf("Attaching observers: %s, %s, and %s to stock '%s'\n",trader1, trader2, portfolio, stock1);
        market.attach(stock1, trader1);
        market.attach(stock1, trader2);
        market.attach(stock1, portfolio);

        System.out.println("Setting " + stock1 + " price & notifying the 3 attached observers...");
        long start = System.nanoTime();
        market.setStockPrice(stock1, 150.00);
        long end = System.nanoTime();
        System.out.println("Time to notify all observers: " + (end - start) + " ns\n");

        // Dynamic detachment
        System.out.printf("Detaching observer: %s from stock '%s'\n", trader2, stock1);
        market.detach(stock1, trader2);

        System.out.println("Setting " + stock1 + " price & notifying the 2 attached observers...");
        start = System.nanoTime();
        market.setStockPrice(stock1, 155.00);
        end = System.nanoTime();
        System.out.println("Time to notify all observers: " + (end - start) + " ns\n");

        System.out.printf("Detaching observer: %s from stock '%s'\n", trader1, stock1);
        market.detach(stock1, trader1);

        System.out.println("Setting " + stock1 + " price & notifying the 1 attached observer...");
        start = System.nanoTime();
        market.setStockPrice(stock1, 155.00);
        end = System.nanoTime();
        System.out.println("Time to notify all observers: " + (end - start) + " ns\n");
    }

    public static void demonstrateCommand() {
        System.out.println("\n=== COMMAND PATTERN: Decoupling Sender and Receiver via Command Objects ===\n");

        StockTransaction transaction = new StockTransaction();
        StockBroker broker = new StockBroker();

        String appleStock = "AAPL";
        String googleStock = "GOOGL";

        // Broker (sender) doesn't know about transaction (receiver) details
        Command buyApple = new BuyStockCommand(transaction, appleStock, 100, 150.00);
        System.out.printf("Created Command object to buy %s stock: %s\n", appleStock, buyApple);
        Command buyGoogle = new BuyStockCommand(transaction, googleStock, 50, 2800.00);
        System.out.printf("Created Command object to buy %s stock: %s\n", googleStock, buyGoogle);

        broker.placeOrder(buyApple);
        System.out.printf("Sender %s invoked command %s.\n", broker, buyApple);
        broker.placeOrder(buyGoogle);
        System.out.printf("Sender %s invoked command %s.\n", broker, buyGoogle);

        System.out.println("\nUndoing last order:");
        broker.undoLastOrder();
        System.out.printf("Sender after undo: %s.\n", broker);
    }

    public static void demonstratePerformance() {
        System.out.println("\n=== PERFORMANCE COMPARISON ===\n");

        // Observer Pattern - O(n) execution
        System.out.println("---OBSERVER - O(n) execution---");
        StockMarket market = new StockMarket();

        int numObservers = 1000;

        System.out.printf("Attaching %d observers to subject %s...\n", numObservers, market);
        for (int i = 0; i < numObservers; i++) {
            market.attach("PERF", new TraderObserver("Trader" + i));
        }

        System.out.printf("Notifying %d observers...\n", numObservers);
        long start = System.nanoTime();
        market.setStockPrice("PERF", 100.00);
        long end = System.nanoTime();
        System.out.println("Time to notify " + numObservers + " observers: " + (end - start) + " ns");

        // Command pattern: O(1) execution
        System.out.println("---COMMAND - O(1) execution---");
        StockTransaction transaction = new StockTransaction();
        Command cmd = new BuyStockCommand(transaction, "PERF", 100, 100.00);
        System.out.printf("Created Command object: %s\n", cmd);

        System.out.println("Executing Command...");
        start = System.nanoTime();
        cmd.execute();
        end = System.nanoTime();
        System.out.println("Time for single command: " + (end - start) + " ns");

        System.out.println("\nConclusion: Command has O(1) execution, Observer has O(n) notification cost");
    }

    public static void main(String[] args) {
        demonstrateObserver();
        demonstrateCommand();
        demonstratePerformance();
    }
}
