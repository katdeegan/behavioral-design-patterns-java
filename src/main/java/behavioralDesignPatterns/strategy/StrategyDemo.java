package behavioralDesignPatterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println("-- Strategy Pattern Demo --");
        System.out.println("Initializing new Context object with ConcreteStrategyA...");
        Context context = new Context(new ConcreteStrategyA());
        context.displayCurrentStrategy();
        System.out.println("Changing Context's Strategy to ConcreteStrategyB at runtime...");
        context.setStrategy( new ConcreteStrategyB());
        context.displayCurrentStrategy();
    }
}
