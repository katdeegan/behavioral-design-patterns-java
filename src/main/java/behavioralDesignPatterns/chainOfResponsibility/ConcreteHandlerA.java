package behavioralDesignPatterns.chainOfResponsibility;

public class ConcreteHandlerA extends Handler {
    public String handle(String request) {
        if (request.contains("A")) return "Handled by A";
        return next != null ? next.handle(request) : "Unhandled";
    }
}