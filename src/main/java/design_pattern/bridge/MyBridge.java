package design_pattern.bridge;

/**
 * Created by shu on 6/21/2016.
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getMethod().method();
    }
}
