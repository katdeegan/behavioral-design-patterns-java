package patternComparison.chainOfResponsibilityVsMediator.mediator;

// Mediator interface - centralizes communication between components

public interface ChatMediator {
    void sendMessage(String message, User sender); // equivalent to a "notify" method
    void addUser(User user);
}
