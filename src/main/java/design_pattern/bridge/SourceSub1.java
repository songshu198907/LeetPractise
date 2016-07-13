package design_pattern.bridge;

/**
 * Created by shu on 6/21/2016.
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("This is method in source sub 1");
    }
}
