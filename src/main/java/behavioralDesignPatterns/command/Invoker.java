package behavioralDesignPatterns.command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        if (command != null) {
            System.out.println("Invoker triggered command:");
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }
}