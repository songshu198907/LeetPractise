package design_pattern.strategy;

/**
 * Created by shu on 2016/9/18.
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("��ͯƱ��");
        return price - 10;
    }
}
