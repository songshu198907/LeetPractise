package design_pattern.factory;

/**
 * Created by shu on 6/21/2016.
 */
public class SenderFactory {
    public Sender produce(String type) {
        if ("sms".equals(type)) {
            return new SmsSender();
        } else if ("mail".equals(type))
            return new MailSender();
        else {
            System.err.println("Please use the right type ");
            return null;
        }
    }

}
