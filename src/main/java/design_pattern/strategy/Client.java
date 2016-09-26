package design_pattern.strategy;

/**
 * Created by shu on 2016/9/18.
 */
public class Client {
    public static void main(String[] args) {
        double price = 100;
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(price);
        System.out.println("原价是 ：\n" + price);
        Discount discount;
        discount = new StudentDiscount();
        ticket.setDiscount(discount);
        System.out.println(ticket.getPrice());
    }
}
