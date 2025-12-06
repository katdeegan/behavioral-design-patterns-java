package behavioralDesignPatterns.state;

public class OrderContext {
    private State state;
    public void setState(State state) { this.state = state; }
    public String processOrder() { return state.handle(); }
}