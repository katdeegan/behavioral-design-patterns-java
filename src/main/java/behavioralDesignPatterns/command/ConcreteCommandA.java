package behavioralDesignPatterns.command;

public class ConcreteCommandA implements Command {
    @Override
    public void execute() {
        System.out.println("Executing Command A: Saving document...");
    }
}