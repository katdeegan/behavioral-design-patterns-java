package patternComparison.chainOfResponsibilityVsMediator.mediator;

// Concrete component - implements User Component interface

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator object - CENTRALIZED communication logic; all communication between User components is handled here

public class ChatRoomMediator implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
