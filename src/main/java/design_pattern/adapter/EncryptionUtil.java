package design_pattern.adapter;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


/**
 * Created by songheng on 9/6/16.
 */
public class EncryptionUtil {
    public byte[] encrypt(byte[] bytes) {
        try {
            System.out.println("Start encrypting...");
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128);
            SecretKey key = kgen.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            ByteOutputStream stream = new ByteOutputStream();
            CipherOutputStream cos = new CipherOutputStream(stream, cipher);
            cos.write(bytes);
            cos.flush();
            cos.close();
            return stream.getBytes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
