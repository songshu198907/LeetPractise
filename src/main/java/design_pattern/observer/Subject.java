package design_pattern.observer;

/**
 * Created by shu on 6/21/2016.
 */
public interface Subject {
    void add(Observer observer);

    void del(Observer observer);

    void notifyObservers();

    void operation();
}
