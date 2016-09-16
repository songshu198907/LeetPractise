package design_pattern.state.practise;

/**
 * Created by songheng on 9/16/16.
 */
public class CardGame {
    private String name;
    private int balance;
    private State state, pri, pro, sec, fin;

    public CardGame(String name) {
        this.name = name;
        balance = 0;
        pri = new Primary();
        pro = new Professional();
        sec = new Secondary();
        fin = new Final();
        this.state = pri;
    }

    public void play(int score) {
        state.play();
        System.out.println(state.getClass().getName());
        state.changeCards();
        state.doubleScore();
        state.peekCards();
        balance += score;
        changeState();
    }

    private void changeState() {
        if (balance < 10) {
            state = pri;
        } else if (balance < 100) {
            state = sec;
        } else if (balance < 1000) {
            state = pro;
        } else {
            state = fin;
        }
    }
}
