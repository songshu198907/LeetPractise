package design_pattern.decorator;

/**
 * Created by shu on 6/21/2016.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Decorator dec = new Decorator(source);
        dec.method();
    }
}
