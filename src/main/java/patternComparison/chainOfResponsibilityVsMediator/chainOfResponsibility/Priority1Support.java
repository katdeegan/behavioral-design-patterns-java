package patternComparison.chainOfResponsibilityVsMediator.chainOfResponsibility;

// Concrete Handler - responsible for handle Priority 1 Support Tickets

public class Priority1Support extends SupportHandler {
    public Priority1Support() {
        super("Priority 1 Support");
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 1) {
            System.out.println(handlerName + " handling: " + ticket.getIssue());
            ticket.resolve();
        } else if (nextHandler != null) {
            System.out.println(handlerName + " forwarding ticket...");
            nextHandler.handleRequest(ticket);
        }
    }
}
