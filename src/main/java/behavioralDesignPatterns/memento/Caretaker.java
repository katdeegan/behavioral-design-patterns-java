package behavioralDesignPatterns.memento;

public class Caretaker {
    private Memento memento;
    public void save(Memento m) { memento = m; }
    public Memento retrieve() { return memento; }
}