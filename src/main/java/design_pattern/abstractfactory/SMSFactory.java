package design_pattern.abstractfactory;

/**
 * Created by shu on 6/21/2016.
 */
public class SMSFactory implements Provider {
    @Override
    public Sender produce() {
        return new SMSSender();
    }
}
