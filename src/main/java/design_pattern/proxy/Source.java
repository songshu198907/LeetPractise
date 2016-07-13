package design_pattern.proxy;

/**
 * Created by shu on 6/21/2016.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("The real method");
    }

}
