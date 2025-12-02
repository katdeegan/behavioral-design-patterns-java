package patternComparison.observerVsCommand.command;

// Command Interface - encapsulates a request as an object

public interface Command {
    void execute();
    void undo(); // optional
}
