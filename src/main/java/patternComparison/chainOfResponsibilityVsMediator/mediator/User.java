package patternComparison.chainOfResponsibilityVsMediator.mediator;

// Component abstract class - contains reference to ChatMediator object for communicating with any other User components

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

    public String getName() {
        return name;
    }
}
