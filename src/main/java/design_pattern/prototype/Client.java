package design_pattern.prototype;

/**
 * Created by songheng on 8/30/16.
 */
public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPm();
        OfficialDocument doc1, doc2, doc3, doc4, doc5, doc6;
        doc1 = pm.getDocument("far");
        doc1.display();
        doc2 = pm.getDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm
                .getDocument("srs");
        doc3.display();
        doc4 = pm
                .getDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);

        doc5 = pm.getDocument("ppr");
        doc5.display();
        doc6 = pm.getDocument("ppr");
        doc6.display();
        System.out.println(doc5 == doc6);
    }
}
