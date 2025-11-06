package behavioralDesignPatterns.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void printStrategy() {
        System.out.println("Current Strategy: Concrete Strategy B");
    }
}
