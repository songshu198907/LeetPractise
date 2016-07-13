package design_pattern.factory;

/**
 * Created by shu on 6/21/2016.
 */
public class MailSender implements Sender {

    @Override
    public void sender() {
        System.out.println("This is mailSender");
    }
}
