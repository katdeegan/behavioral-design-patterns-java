package behavioralDesignPatterns.command;

public class CommandDemo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setCommand(new ConcreteCommandA());
        invoker.invoke();

        invoker.setCommand(new ConcreteCommandB());
        invoker.invoke();
    }
}
