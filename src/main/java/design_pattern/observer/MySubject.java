package design_pattern.observer;

import java.util.Vector;

/**
 * Created by shu on 6/21/2016.
 */
public class MySubject implements Subject {
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        if (observer != null && vector.contains(observer))
            vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : vector) {
            obs.update();
        }
    }

    @Override
    public void operation() {
        System.out.println("My subject updated");
        notifyObservers();
    }
}
