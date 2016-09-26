package design_pattern.strategy;

/**
 * Created by shu on 2016/9/18.
 */
public class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("VIP 折扣");
        System.out.println("积分启用");
        return price * 0.5;
    }
}
