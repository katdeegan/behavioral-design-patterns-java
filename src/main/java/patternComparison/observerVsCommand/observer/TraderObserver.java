package patternComparison.observerVsCommand.observer;

// Concrete Observer - implements the IStockObserver interface

public class TraderObserver implements IStockObserver {
    private String name;

    public TraderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        // Commenting out for performance test with 1000 observers
        // System.out.println(name + " notified: " + stock + " is now $" + price);
    }

    @Override
    public String toString() {
        return "TraderObserver{name='" + name + "'}";
    }
}
