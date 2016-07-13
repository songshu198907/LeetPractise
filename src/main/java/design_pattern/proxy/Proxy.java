package design_pattern.proxy;

/**
 * Created by shu on 6/21/2016.
 */
public class Proxy implements Sourceable {
    private Sourceable source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before proxy ");
    }

    private void after() {
        System.out.println("After proxy");
    }

}
