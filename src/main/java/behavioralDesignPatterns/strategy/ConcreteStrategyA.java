package behavioralDesignPatterns.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void printStrategy() {
        System.out.println("Current Strategy: Concrete Strategy A");
    }
}
