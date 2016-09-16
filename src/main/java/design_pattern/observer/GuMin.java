package design_pattern.observer;

import java.util.Observable;

/**
 * Created by songheng on 9/16/16.
 */
public class GuMin implements java.util.Observer {
    private String name;

    public GuMin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + " 不好啦！　股票　" + arg + " 大跌了，　有" + (o.countObservers() - 1) + "人 陪你一起跳楼了！");

    }
}
