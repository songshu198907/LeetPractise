package design_pattern.proxy;

/**
 * Created by shu on 6/21/2016.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable proxy = new Proxy();
        proxy.method();
    }
}
