package design_pattern.strategy;

/**
 * Created by shu on 6/21/2016.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] nums = split(exp, "-");
        return nums[0] - nums[1];
    }
}
