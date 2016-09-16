package design_pattern.state;

/**
 * Created by songheng on 9/16/16.
 */
public class OnState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("已经打开");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        Switch.setState(Switch.getState("off"));
    }
}
