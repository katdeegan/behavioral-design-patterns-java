package behavioralDesignPatterns.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Current State: " + state);
    }

    public String getState() { return state; }

    public Memento saveState() { return new Memento(state); }

    public void restoreState(Memento memento) {
        state = memento.getState();
        System.out.println("Restored to State: " + state);
    }
}