package behavioralDesignPatterns.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expr = new AddExpression(
                new NumberExpression(2),
                new NumberExpression(3)
        );
        System.out.println("Result: " + expr.interpret());
    }
}