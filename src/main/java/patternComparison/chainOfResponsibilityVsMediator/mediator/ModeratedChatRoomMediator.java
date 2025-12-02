package patternComparison.chainOfResponsibilityVsMediator.mediator;

import java.util.*;

// Concrete Mediator object with message filtering

public class ModeratedChatRoomMediator extends ChatRoomMediator {
    private List<User> users = new ArrayList<>();
    private Set<String> bannedWords = new HashSet<>(Arrays.asList("spam", "banned"));

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        if (containsBannedWords(message)) {
            sender.receive("Message blocked by moderator");
            return;
        }

        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }

    private boolean containsBannedWords(String message) {
        String lowerMessage = message.toLowerCase();
        return bannedWords.stream().anyMatch(lowerMessage::contains);
    }
}
