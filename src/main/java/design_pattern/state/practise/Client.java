package design_pattern.state.practise;

/**
 * Created by songheng on 9/16/16.
 */
public class Client {
    public static void main(String[] args) {
        CardGame cg = new CardGame("张无忌");
        cg.play(10);
        System.out.println("-------------------");
        cg.play(1320);
        System.out.println("-------------------");
        cg.play(-1230);
        System.out.println("-------------------");
        cg.play(1330);

    }
}
