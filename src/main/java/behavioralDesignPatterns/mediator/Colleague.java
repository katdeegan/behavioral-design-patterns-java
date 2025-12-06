package behavioralDesignPatterns.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receive(String message);

    public void send(String message) {
        mediator.send(message, this);
    }
}