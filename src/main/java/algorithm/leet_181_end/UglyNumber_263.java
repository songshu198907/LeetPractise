package algorithm.leet_181_end;

/**
 * Created by shu on 6/22/2016.
 */
public class UglyNumber_263 {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0)
            num = num / 2;
        while (num % 3 == 0)
            num = num / 3;
        while (num % 5 == 0)
            num = num / 5;
        return num == 1;
    }
}
