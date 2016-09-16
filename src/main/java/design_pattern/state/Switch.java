package design_pattern.state;

/**
 * Created by songheng on 9/16/16.
 */
public class Switch {
    private static State state, onState, offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        state = onState;
    }

    public static void setState(State st) {
        state = st;
    }

    public static State getState(String type) {
        if (type.equalsIgnoreCase("on")) {
            return onState;
        } else {
            return offState;
        }
    }

    public void on() {
        System.out.print(name);
        state.on(this);
    }

    public void off() {
        System.out.print(name);
        state.off(this);

    }
}
