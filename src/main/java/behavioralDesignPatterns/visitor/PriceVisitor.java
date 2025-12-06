package behavioralDesignPatterns.visitor;

public class PriceVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Pricing book: " + book.getTitle());
    }

    @Override
    public void visit(CD cd) {
        System.out.println("Pricing CD: " + cd.getName());
    }
}