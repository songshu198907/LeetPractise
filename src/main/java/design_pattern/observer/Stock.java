package design_pattern.observer;

import java.util.Observable;
import java.util.Random;

/**
 * Created by songheng on 9/16/16.
 */
public class Stock extends Observable {
    private String name;

    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkPrice() {
        Random random = new Random();
        while (random.nextDouble() > 0.5) {
            System.out.println("幅度不到不用担心");
        }
        setChanged();
        notifyObservers(name);
    }

//    @Override
//    public void notifyObservers(Object arg) {
//        for(java.util.Observer ob : obs)
//    }
}
