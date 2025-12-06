package behavioralDesignPatterns.templateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        AbstractProcessor processorA = new ConcreteProcessorA();
        AbstractProcessor processorB = new ConcreteProcessorB();

        processorA.process();
        System.out.println("----------------");
        processorB.process();
    }
}