package behavioralDesignPatterns.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Version 1");
        caretaker.save(originator.saveState());

        originator.setState("Version 2");
        originator.restoreState(caretaker.retrieve());
    }
}