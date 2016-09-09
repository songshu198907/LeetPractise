package design_pattern.decorator;

/**
 * Created by songheng on 9/8/16.
 */
public class Client {
    public static void main(String[] args) {
        Encryptor en1, en2, en3;
        en1 = new SimpleEncryptor();
        en2 = new AdvancedDecorator(en1);
        en3 = new AdvancedDecorator(en2);
        en3.encrypt();
    }
}
