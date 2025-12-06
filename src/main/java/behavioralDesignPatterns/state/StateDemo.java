package behavioralDesignPatterns.state;

public class StateDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.setState(new PendingState());
        System.out.println(order.processOrder());
        order.setState(new ShippedState());
        System.out.println(order.processOrder());
    }
}