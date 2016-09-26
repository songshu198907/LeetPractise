package design_pattern.strategy.practise;

/**
 * Created by shu on 2016/9/18.
 */
public class AirPlane implements Flight {

    @Override
    public void startFly() {
        System.out.println("客机正准备长距离起飞！");
    }

    @Override
    public void keepFly() {
        System.out.println("客机正在亚音速巡航！");
    }
}
