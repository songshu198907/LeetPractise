package design_pattern.adpater;

/**
 * Created by shu on 6/21/2016.
 */
public class ClassAdapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is the method in class adapter");
    }
}
