package design_pattern.prototype;

/**
 * Created by songheng on 8/30/16.
 */
public class SRS implements OfficialDocument {
    @Override
    public void display() {
        System.out.println("ruan jian xu qiu shuo ming shu");
    }

    @Override
    public OfficialDocument clone() {

        try {
            return (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Not Cloneable!");
        }
        return null;
    }
}
