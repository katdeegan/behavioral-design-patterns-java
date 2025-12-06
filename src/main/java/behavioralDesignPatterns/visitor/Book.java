package behavioralDesignPatterns.visitor;

public class Book implements Element {
    private final String title;

    public Book(String title) { this.title = title; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() { return title; }
}