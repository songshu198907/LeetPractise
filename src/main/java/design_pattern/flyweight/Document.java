package design_pattern.flyweight;

/**
 * Created by songheng on 9/9/16.
 */
public abstract class Document {
    public abstract String getType();

    public void display(Size size) {
        System.out.println("图形　：　" + getType() + " ，长　：" + size.getLength() + "宽：" + size.getWidth());
    }


}
