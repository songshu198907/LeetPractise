package design_pattern.strategy;

/**
 * Created by shu on 6/21/2016.
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] num = split(exp, "\\+");
        return num[0] + num[1];
    }
}
