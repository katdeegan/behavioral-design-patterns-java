package behavioralDesignPatterns.visitor;

public interface Element {
    void accept(Visitor visitor);
}