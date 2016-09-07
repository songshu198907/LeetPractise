package design_pattern.bridge;

/**
 * Created by songheng on 9/7/16.
 */
public class TXTConverter extends DataConverter {

    @Override
    public void convert() {
        loader.load();
        System.out.println("using txt converter now.");
    }
}
