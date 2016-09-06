package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public class DBClassAdapter extends EncryptionUtil implements IDAO {

    public void save(String word) {
        byte[] arr = encrypt(word.getBytes());
        System.out.println("After encrypting:" + new String(arr));
    }
}
