package behavioralDesignPatterns.chainOfResponsibility;

public abstract class Handler {
    protected Handler next;
    public void setNext(Handler next) { this.next = next; }
    public abstract String handle(String request);
}
