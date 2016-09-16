package design_pattern.state.practise;

/**
 * Created by songheng on 9/16/16.
 */
public abstract class State {
    public void play() {
        System.out.println("开始打牌！");
    }

    public abstract void doubleScore();

    public abstract void changeCards();

    public abstract void peekCards();
}
