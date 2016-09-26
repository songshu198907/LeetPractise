package design_pattern.strategy.practise;

/**
 * Created by shu on 2016/9/18.
 */
public class Helicopter implements Flight {
    @Override
    public void startFly() {
        System.out.println("直升机将垂直起飞！");
    }

    @Override
    public void keepFly() {
        System.out.println("直升机巡航为亚音速飞行");
    }
}
