package patternComparison.chainOfResponsibilityVsMediator.chainOfResponsibility;

// Request object Client will initiate to a Concrete Handler

public class SupportTicket {
    private String issue;
    private int priority; // 1=low, 2=medium, 3=high
    private boolean resolved;

    public SupportTicket(String issue, int priority) {
        this.issue = issue;
        this.priority = priority;
        this.resolved = false;
    }

    public String getIssue() { return issue; }
    public int getPriority() { return priority; }
    public boolean isResolved() { return resolved; }
    public void resolve() { this.resolved = true; }
}
