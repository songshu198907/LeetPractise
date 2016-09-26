package design_pattern.strategy.practise;

/**
 * Created by shu on 2016/9/18.
 */
public class Harrier implements Flight {
    @Override
    public void startFly() {
        System.out.println("鹞式战斗机将垂直起飞！");
    }

    @Override
    public void keepFly() {
        System.out.println("鹞式战斗机正在超音速飞行！");
    }
}
