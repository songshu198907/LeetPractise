package design_pattern.prototype;

/**
 * Created by songheng on 8/30/16.
 */
public class FAR implements OfficialDocument {
    @Override
    public void display() {
        System.out.println("ke xing xing bao gao fen xi");
    }

    @Override
    public OfficialDocument clone() {
        OfficialDocument obj = null;
        try {
            obj = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Not cloneable");
        }
        return obj;
    }
}
