package design_pattern.state;

/**
 * Created by songheng on 9/16/16.
 */
public abstract class State {
    public abstract void on(Switch s);

    public abstract void off(Switch s);
}
