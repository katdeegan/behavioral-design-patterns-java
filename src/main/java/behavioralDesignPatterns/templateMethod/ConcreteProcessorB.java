package behavioralDesignPatterns.templateMethod;

public class ConcreteProcessorB extends AbstractProcessor {
    @Override
    protected void execute() {
        System.out.println("Processing data using method B...");
    }
}