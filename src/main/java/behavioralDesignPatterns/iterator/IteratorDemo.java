package behavioralDesignPatterns.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection();
        IteratorCustom<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}