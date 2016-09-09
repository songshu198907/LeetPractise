package design_pattern.decorator;

/**
 * Created by songheng on 9/8/16.
 */
public class SimpleEncryptor implements Encryptor {

    public void encrypt() {
        System.out.println(
                "使用简单加密!"
        );

    }
}
