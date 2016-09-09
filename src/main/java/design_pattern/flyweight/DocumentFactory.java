package design_pattern.flyweight;

import java.util.HashMap;

/**
 * Created by songheng on 9/9/16.
 */
public class DocumentFactory {
    private static DocumentFactory instance = new DocumentFactory();
    private static HashMap<String, Document> table;

    private DocumentFactory() {
        table = new HashMap<>();
        Document txt, img, vdo;
        txt = new TXTDocument();
        img = new IMGDocument();
        vdo = new VDODocument();
        table.put("txt", txt);
        table.put("img", img);
        table.put("vdo", vdo);
    }

    public static DocumentFactory getInstance() {
        return instance;
    }

    public Document getDocument(String key) {
        if (table.containsKey(key)) {
            return table.get(key);
        } else {
            System.err.println("找不到对象");
            return null;
        }
    }

}
