package design_pattern.state;

/**
 * Created by songheng on 9/16/16.
 */
public class OffState extends State {

    @Override
    public void on(Switch s) {
        System.out.println("打开");
        Switch.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭!");
    }
}

