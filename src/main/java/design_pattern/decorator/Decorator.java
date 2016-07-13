package design_pattern.decorator;

/**
 * Created by shu on 6/21/2016.
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Before method");
        source.method();
        System.out.println("After method");
    }
}
