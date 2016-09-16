package design_pattern.state.practise;

/**
 * Created by songheng on 9/16/16.
 */
public class Primary extends State {
    @Override
    public void doubleScore() {
        System.out.println("想多了！");
    }

    @Override
    public void changeCards() {

        System.out.println("想多了不是！");
    }

    @Override
    public void peekCards() {
        System.out.println("想太多了！");
    }
}
