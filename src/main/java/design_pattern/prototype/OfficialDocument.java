package design_pattern.prototype;

/**
 * Created by songheng on 8/30/16.
 */
public interface OfficialDocument extends Cloneable {
    void display();

    OfficialDocument clone();
}
