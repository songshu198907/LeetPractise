package design_pattern.bridge;

/**
 * Created by songheng on 9/7/16.
 */
public abstract class DataConverter {
    protected DBLoader loader;

    public void setLoader(DBLoader loader) {
        this.loader = loader;
    }

    public abstract void convert();
}
