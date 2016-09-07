package design_pattern.bridge;

/**
 * Created by songheng on 9/7/16.
 */
public class XMLConverter extends DataConverter {

    @Override
    public void convert() {
        loader.load();
        System.out.println("使用的是XML转换器！");
    }
}
