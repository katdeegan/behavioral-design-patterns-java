package behavioralDesignPatterns.iterator;

public class NameCollection {
    private final String[] names = {"Alice", "Bob", "Charlie"};

    public IteratorCustom<String> iterator() {
        return new IteratorCustom<String>() {
            int index = 0;
            public boolean hasNext() { return index < names.length; }
            public String next() { return names[index++]; }
        };
    }
}