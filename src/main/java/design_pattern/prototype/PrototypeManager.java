package design_pattern.prototype;

import java.util.Hashtable;

/**
 * Created by songheng on 8/30/16.
 */
public class PrototypeManager {
    private static PrototypeManager pm = new PrototypeManager();
    private Hashtable ht;

    private PrototypeManager() {
        ht = new Hashtable();
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
        ht.put("ppr", new PPR());
    }

    public static PrototypeManager getPm() {
        return pm;
    }

    public void addDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    public OfficialDocument getDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }
}
