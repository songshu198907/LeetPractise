package design_pattern.state;

/**
 * Created by songheng on 9/16/16.
 */
public class Client {
    public static void main(String[] args) {
        Switch s1, s2;
        s1 = new Switch("开关１");
        s2 = new Switch("开关２");
        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();

    }
}
