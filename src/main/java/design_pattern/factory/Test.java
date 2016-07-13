package design_pattern.factory;

/**
 * Created by shu on 6/21/2016.
 */
public class Test {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.sender();
    }
}
