package behavioralDesignPatterns.state;

public class ShippedState implements State {
    public String handle() { return "Order has been shipped"; }
}