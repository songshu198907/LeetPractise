package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public class DBAdapter implements IDAO {
    private EncryptionUtil util;

    public DBAdapter() {
        util = new EncryptionUtil();
    }

    @Override
    public void save(String word) {
        System.out.println("233 encrypting ");
        util.encrypt(word.getBytes());
    }
}
