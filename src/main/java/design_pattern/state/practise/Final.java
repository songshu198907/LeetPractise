package design_pattern.state.practise;

/**
 * Created by songheng on 9/16/16.
 */
public class Final extends State {
    @Override
    public void doubleScore() {
        System.out.println("开启双倍积分！");
    }

    @Override
    public void changeCards() {
        System.out.println("妙手空空！");
    }

    @Override
    public void peekCards() {
        System.out.println("偷瞄一眼！");
    }
}
