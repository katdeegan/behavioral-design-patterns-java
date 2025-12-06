package behavioralDesignPatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer A");
        Observer observer2 = new ConcreteObserver("Observer B");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.changeState("ACTIVE");
        subject.changeState("INACTIVE");
    }
}