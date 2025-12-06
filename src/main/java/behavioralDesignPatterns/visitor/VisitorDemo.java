package behavioralDesignPatterns.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Visitor visitor = new PriceVisitor();
        Element book = new Book("Design Patterns");
        Element cd = new CD("Classical Hits");

        book.accept(visitor);
        cd.accept(visitor);
    }
}