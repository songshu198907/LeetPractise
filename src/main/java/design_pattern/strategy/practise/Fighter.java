package design_pattern.strategy.practise;

/**
 * Created by shu on 2016/9/18.
 */
public class Fighter implements Flight {
    @Override
    public void startFly() {
        System.out.println("战斗机需要长距离起飞！");
    }

    @Override
    public void keepFly() {
        System.out.println("战斗机会超极速巡航！");
    }
}
