package algorithm.leet_181_320;

/**
 * Created by shu on 7/24/2016.
 */
public class Bulb_Switcher_319 {
    public int bulbSwitch(int n) {
        int total = 1;
        while (total * total <= n) total++;

        return --total;
    }
}
