package algorithm.leet_181_320;

/**
 * Created by shu on 7/24/2016.
 */
public class Bulb_Switcher_319 {
    public int bulbSwitch(int n) {
        int res = 0;
        while ((res * res) <= n)
            res++;
        return --res;
    }
}
