package design_pattern.bridge;

/**
 * Created by songheng on 9/7/16.
 */
public class OracleLoader implements DBLoader {
    @Override
    public void load() {
        System.out.println("使用Ｏｒａｃｌｅ载入器！");
    }
}
