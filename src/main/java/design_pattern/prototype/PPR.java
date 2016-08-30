package design_pattern.prototype;

/**
 * Created by songheng on 8/30/16.
 */
public class PPR implements OfficialDocument {

    @Override
    public void display() {
        System.out.println("Xiang mu jin zhan bao gao !");
    }

    @Override
    public OfficialDocument clone() {
        try {
            return (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Not Cloneable");
        }
        return null;
    }
}
