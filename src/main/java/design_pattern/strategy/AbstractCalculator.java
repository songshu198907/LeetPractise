package design_pattern.strategy;

/**
 * Created by shu on 6/21/2016.
 */
public abstract class AbstractCalculator {
    protected int[] split(String exp, String opt) {
        String[] tmp = exp.split(opt);
        int[] res = new int[2];
        res[0] = Integer.parseInt(tmp[0]);
        res[1] = Integer.parseInt(tmp[1]);
        return res;

    }
}
