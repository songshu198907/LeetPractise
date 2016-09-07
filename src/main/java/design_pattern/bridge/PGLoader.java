package design_pattern.bridge;

/**
 * Created by songheng on 9/7/16.
 */
public class PGLoader implements DBLoader {
    @Override
    public void load() {
        System.out.println("使用ＰＧ载入器！");
    }
}
