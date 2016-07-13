package design_pattern.bridge;

/**
 * Created by shu on 6/21/2016.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        bridge.setMethod(new SourceSub1());
        bridge.method();
        bridge.setMethod(new SourceSub2());
        bridge.method();
    }
}
