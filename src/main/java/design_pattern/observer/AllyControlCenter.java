package design_pattern.observer;

import java.util.ArrayList;

/**
 * Created by songheng on 9/16/16.
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList<Observer> players = new ArrayList<>();

    public void setAllyName(String name) {
        this.allyName = name;
    }

    public void join(Observer obs) {
        System.out.println(obs.getName() + " 加入" + this.allyName + " 战队！");
        players.add(obs);
    }

    public void quit(Observer obs) {
        System.out.println(obs.getName() + " 退出　" + this.allyName + "战队");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);
}
