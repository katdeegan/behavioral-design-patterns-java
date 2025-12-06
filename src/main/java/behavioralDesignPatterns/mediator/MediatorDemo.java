package behavioralDesignPatterns.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague alice = new ConcreteColleague(mediator, "Alice");
        Colleague bob = new ConcreteColleague(mediator, "Bob");

        mediator.register(alice);
        mediator.register(bob);

        alice.send("Hello Bob!");
        bob.send("Hi Alice!");
    }
}