package patternComparison.chainOfResponsibilityVsMediator.chainOfResponsibility;

// Concrete Handler - responsible for handle Priority 3 Support Tickets

public class Priority3Support extends SupportHandler {
    public Priority3Support() {
        super("Priority 3 Support");
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 3) {
            System.out.println(handlerName + " handling: " + ticket.getIssue());
            ticket.resolve();
        } else if (nextHandler != null) {
            System.out.println(handlerName + " cannot handle this ticket");
            nextHandler.handleRequest(ticket);
        } else {
            System.out.println(handlerName + " - No handler found for ticket");
        }
    }
}
