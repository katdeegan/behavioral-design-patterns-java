package patternComparison.observerVsCommand.observer;

// Subject - the object whose state the IStockObservers are interested in

import java.util.*;

public class StockMarket {
    // maintains a list of observers all adhering to a common interface
    private Map<String, List<IStockObserver>> observers = new HashMap<>(); // "stock1" : [IStockObserver1, IStockObserver2, ...]

    private Map<String, Double> stockPrices = new HashMap<>();

    public void attach(String stock, IStockObserver observer) {
        List<IStockObserver> observerList = observers.computeIfAbsent(stock, k -> new ArrayList<>());
        observerList.add(observer);
    }

    public void detach(String stock, IStockObserver observer) {
        List<IStockObserver> stockObservers = observers.get(stock);
        if (stockObservers != null) {
            stockObservers.remove(observer);
        }
    }

    public void setStockPrice(String stock, double price) {
        stockPrices.put(stock, price);
        notifyObservers(stock, price); // all observers notified on each change
    }

    private void notifyObservers(String stock, double price) {
        List<IStockObserver> stockObservers = observers.get(stock);
        if (stockObservers != null) {
            // PERFORMANCE IMPACT: O(n) notifications
            for (IStockObserver observer : stockObservers) {
                observer.update(stock, price);
            }
        }
    }

    @Override
    public String toString() {
        return "StockMarket{stockPrices=" + stockPrices + "}";
    }
}

