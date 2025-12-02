package patternComparison.chainOfResponsibilityVsMediator.chainOfResponsibility;

// Handler interface - contains a handleRequest() method that all concrete handlers must implement

public abstract class SupportHandler {
    protected SupportHandler nextHandler; // all Handler objects have access to their successor (next Handler in the chain)
    protected String handlerName;

    public SupportHandler(String name) {
        this.handlerName = name;
    }

    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(SupportTicket ticket);
}
