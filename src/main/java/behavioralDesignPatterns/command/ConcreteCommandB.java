package behavioralDesignPatterns.command;

public class ConcreteCommandB implements Command {
    @Override
    public void execute() {
        System.out.println("Executing Command B: Printing document...");
    }
}