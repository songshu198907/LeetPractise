package design_pattern.decorator;

/**
 * Created by songheng on 9/8/16.
 */
public abstract class Decorator implements Encryptor {
    protected Encryptor encryptor;

    public Decorator(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    public void encrypt() {
        encryptor.encrypt();
    }
}
