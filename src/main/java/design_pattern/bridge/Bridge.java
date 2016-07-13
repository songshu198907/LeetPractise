package design_pattern.bridge;

/**
 * Created by shu on 6/21/2016.
 */
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getMethod() {
        return source;
    }

    public void setMethod(Sourceable source) {
        this.source = source;
    }
}
