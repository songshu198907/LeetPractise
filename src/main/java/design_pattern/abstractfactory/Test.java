package design_pattern.abstractfactory;

/**
 * Created by shu on 6/21/2016.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();

    }
}
