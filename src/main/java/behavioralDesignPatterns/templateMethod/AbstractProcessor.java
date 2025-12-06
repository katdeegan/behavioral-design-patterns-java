package behavioralDesignPatterns.templateMethod;

public abstract class AbstractProcessor {

    public final void process() {
        open();
        execute();
        close();
    }

    protected void open() {
        System.out.println("Opening resources...");
    }

    protected abstract void execute();

    protected void close() {
        System.out.println("Closing resources.");
    }
}