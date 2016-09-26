package design_pattern.strategy;

/**
 * Created by shu on 2016/9/18.
 */
public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("学生折扣");
        return price * 0.8;
    }
}
