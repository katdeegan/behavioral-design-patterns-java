package patternComparison.observerVsCommand.command;

import java.util.ArrayList;
import java.util.List;

// Sender (Invoker) - responsible for initiating requests

public class StockBroker {
    private List<Command> commandHistory = new ArrayList<>(); // reference to Command objects (maintains history to support undo)

    // Sender doesn't know about receiver implementation
    public void placeOrder(Command command) {
        command.execute(); // initiates request through the Command object (no knowledge of who will actually fulfill request)
        commandHistory.add(command);
    }

    public void undoLastOrder() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.remove(commandHistory.size() - 1);
            command.undo();
        }
    }

    @Override
    public String toString() {
        return "StockBroker{commandHistory=" + commandHistory + "}";
    }
}
