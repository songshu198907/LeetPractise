package design_pattern.composite;

/**
 * Created by songheng on 9/7/16.
 */
public class Client {
    public static void main(String[] args) {
        Component btn1 = new Button();
        Component btn2 = new Button();
        Component text1 = new TextBox();
        Component text2 = new TextBox();
        Component fr1 = new Frame();
        Component fr2 = new Frame();
        Component md1 = new MiddleWare();
        Component md2 = new MiddleWare();
        fr1.add(btn1);
        fr1.add(text1);
        md1.add(fr1);
        md1.add(btn1);
        md2.add(btn2);
        md2.add(text2);
        fr2.add(md2);
        fr2.add(btn2);
        fr2.operation();
        md1.operation();
    }
}
