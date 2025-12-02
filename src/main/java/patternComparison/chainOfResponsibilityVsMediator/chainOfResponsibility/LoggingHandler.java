package patternComparison.chainOfResponsibilityVsMediator.chainOfResponsibility;

// Concrete Handler - lowest level on Handler chain

public class LoggingHandler extends SupportHandler {
    public LoggingHandler() {
        super("Logging Handler");
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        System.out.println("[LOG] Ticket received: " + ticket.getIssue() +
                " (Priority: " + ticket.getPriority() + ")");
        if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
