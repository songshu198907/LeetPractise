package design_pattern.abstractfactory;

/**
 * Created by shu on 6/21/2016.
 */
public class SMSSender implements Sender {
    @Override
    public void send() {
        System.out.println("Sms sender invoked.");
    }
}
