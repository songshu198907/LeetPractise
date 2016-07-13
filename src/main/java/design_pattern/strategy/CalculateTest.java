package design_pattern.strategy;

/**
 * Created by shu on 6/21/2016.
 */
public class CalculateTest {
    public static void main(String[] args) {
        ICalculator calculator = new Minus();
        System.out.println(calculator.calculate("2-3"));
    }
}
