package behavioralDesignPatterns.mediator;

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}