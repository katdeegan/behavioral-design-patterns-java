package behavioralDesignPatterns.visitor;

public class CD implements Element {
    private final String name;

    public CD(String name) { this.name = name; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() { return name; }
}