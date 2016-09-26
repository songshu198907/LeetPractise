package design_pattern.strategy;

/**
 * Created by shu on 2016/9/18.
 */
public class MovieTicket {
    private double price;
    private Discount discount;

    public double getPrice() {
        return discount.calculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
