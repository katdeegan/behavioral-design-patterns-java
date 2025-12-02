package patternComparison.observerVsCommand.observer;

// Observer Interface - common interface all StockMarket observers must implement

public interface IStockObserver {
    void update(String stock, double price);
}
