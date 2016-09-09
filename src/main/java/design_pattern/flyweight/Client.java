package design_pattern.flyweight;

/**
 * Created by songheng on 9/9/16.
 */
public class Client {
    public static void main(String[] args) {
        Document txt1, txt2, txt3, img1, img2, vdo1, vdo2;
        DocumentFactory factory = DocumentFactory.getInstance();
        txt1 = factory.getDocument("txt");
        txt2 = factory.getDocument("txt");
        txt3 = factory.getDocument("txt");
        System.out.println(txt1 == txt2);
        System.out.println(txt1 == txt3);
        img1 = factory.getDocument("img");
        img2 = factory.getDocument("img");
        vdo1 = factory.getDocument("vdo");
        vdo2 = factory.getDocument("vdo");
        System.out.println(img1 == img2);
        System.out.println(vdo1 == vdo2);
        txt1.display(new Size(10, 10));
        txt2.display(new Size(10, 20));
        img1.display(new Size(10, 20));
        img2.display(new Size(103, 202));
        vdo1.display(new Size(231, 231));
    }
}
