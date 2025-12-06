package behavioralDesignPatterns.templateMethod;

public class ConcreteProcessorA extends AbstractProcessor {
    @Override
    protected void execute() {
        System.out.println("Processing data using method A...");
    }
}