package behavioralDesignPatterns.state;

public class PendingState implements State {
    public String handle() { return "Order is pending"; }
}