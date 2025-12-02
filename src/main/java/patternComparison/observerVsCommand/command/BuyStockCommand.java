package patternComparison.observerVsCommand.command;

// Concrete Command - implements Command interface
// Command handle the details of HOW the request is passed to the Receiver, the Receiver object
// does the actual work.

public class BuyStockCommand implements Command {
    private StockTransaction transaction;
    private String stock;
    private int quantity;
    private double price;

    public BuyStockCommand(StockTransaction transaction, String stock, int quantity, double price) {
        this.transaction = transaction; // reference to Receiver object
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void execute() {
        transaction.buy(stock, quantity, price); // delegate to Receiver to fulfill request
    }

    @Override
    public void undo() {
        transaction.sell(stock, quantity, price);
    }

    @Override
    public String toString() {
        return String.format(
                "BuyStockCommand{stock='%s', quantity=%d, price=%.2f}",
                stock, quantity, price
        );
    }

}
