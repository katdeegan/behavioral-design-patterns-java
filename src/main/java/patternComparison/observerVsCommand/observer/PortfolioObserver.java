package patternComparison.observerVsCommand.observer;

import java.util.HashMap;
import java.util.Map;

public class PortfolioObserver implements IStockObserver {
    private Map<String, Double> holdings = new HashMap<>();

    @Override
    public void update(String stock, double price) {
        holdings.put(stock, price);
        System.out.println("Portfolio updated: " + stock + " = $" + price);
    }

    @Override
    public String toString() {
        return "PortfolioObserver{holdings=" + holdings + "}";
    }

}
