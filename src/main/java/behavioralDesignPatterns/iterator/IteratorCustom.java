package behavioralDesignPatterns.iterator;

public interface IteratorCustom<T> {
    boolean hasNext();
    T next();
}