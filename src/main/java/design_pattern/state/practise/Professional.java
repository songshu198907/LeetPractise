package design_pattern.state.practise;

/**
 * Created by songheng on 9/16/16.
 */
public class Professional extends State {
    @Override
    public void doubleScore() {
        System.out.println("双倍积分已开启！");
    }

    @Override
    public void changeCards() {
        System.out.println("手牌已换");
    }

    @Override
    public void peekCards() {
        System.out.println("想太多了！");
    }
}
