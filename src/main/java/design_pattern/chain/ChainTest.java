package design_pattern.chain;

/**
 * Created by shu on 6/21/2016.
 */
public class ChainTest {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("first");
        MyHandler handler2 = new MyHandler("second");
        MyHandler handler3 = new MyHandler("third");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.operator();
    }
}
