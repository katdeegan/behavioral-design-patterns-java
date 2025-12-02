package patternComparison.chainOfResponsibilityVsMediator.chainOfResponsibility;

// Concrete Handler - responsible for handle Priority 2 Support Tickets

public class Priority2Support extends SupportHandler {
    public Priority2Support() {
        super("Priority 2 Support");
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 2) {
            System.out.println(handlerName + " handling: " + ticket.getIssue());
            ticket.resolve();
        } else if (nextHandler != null) {
            System.out.println(handlerName + " forwarding ticket...");
            nextHandler.handleRequest(ticket);
        }
    }
}
