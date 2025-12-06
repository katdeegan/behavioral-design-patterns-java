package behavioralDesignPatterns.chainOfResponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);

        System.out.println(handlerA.handle("Request A"));
        System.out.println(handlerA.handle("Request B"));
        System.out.println(handlerA.handle("Request X"));
    }
}