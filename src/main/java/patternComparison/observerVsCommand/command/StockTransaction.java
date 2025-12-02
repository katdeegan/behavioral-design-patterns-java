package patternComparison.observerVsCommand.command;

// Receiver - contains the business logic to do the actual work required to fulfill a request
// Receiver has no knowledge of who initiated request.

public class StockTransaction {
    private String stock;
    private int quantity;
    private double price;

    public void buy(String stock, int quantity, double price) {
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        System.out.println("Bought " + quantity + " shares of " + stock + " at $" + price);
    }

    public void sell(String stock, int quantity, double price) {
        System.out.println("Sold " + quantity + " shares of " + stock + " at $" + price);
    }
}
