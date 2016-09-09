package design_pattern.decorator;

/**
 * Created by songheng on 9/8/16.
 */
public class AdvancedDecorator extends Decorator {
    public AdvancedDecorator(Encryptor encryptor) {
        super(encryptor);
        System.out.println("增加高级加密功能。");
    }

    public void encrypt() {
        advabcedEncrypt();
        super.encrypt();
    }

    public void advabcedEncrypt() {
        System.out.println("使用高级加密！");
    }
}
