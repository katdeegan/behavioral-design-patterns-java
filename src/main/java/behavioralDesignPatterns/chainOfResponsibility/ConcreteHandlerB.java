package behavioralDesignPatterns.chainOfResponsibility;

public class ConcreteHandlerB extends Handler {
    public String handle(String request) {
        if (request.contains("B")) return "Handled by B";
        return next != null ? next.handle(request) : "Unhandled";
    }
}