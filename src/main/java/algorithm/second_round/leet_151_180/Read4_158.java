package algorithm.second_round.leet_151_180;

import java.util.Random;

/**
 * Created by songheng on 10/17/16.
 */
public class Read4_158 extends Read4 {
    private char[] buffer = new char[4];
    private int offset = 0, bufsize = 0;

    public int read(char[] buf, int n) {
        for (int i = 0; i < n; i += 4) {
            char[] temp = new char[4];
            int len = read4(temp);
            System.arraycopy(temp, 0, buf, i, Math.min(len, n - i));
            if (len < 4) return Math.min(i + len, n);

        }
        return n;
    }
}

abstract class Read4 {
    int read4(char[] tmp) {
        return new Random().nextInt(4);
    }
}