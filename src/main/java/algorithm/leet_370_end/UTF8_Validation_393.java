package algorithm.leet_370_end;

/**
 * Created by shu on 2016/9/27.
 */
public class UTF8_Validation_393 {
    public boolean validUtf8(int[] data) {
        int cnt = 0;
        for (int d : data) {
            if (cnt == 0) {
                if ((d >> 5) == 0b110) cnt = 1;
                else if ((d >> 4) == 0b1110) cnt = 2;
                else if ((d >> 3) == 0b11110) cnt = 3;
                else if ((d >> 7) == 1) return false;
            } else {
                if ((d >> 6) != 0b10) return false;
                --cnt;
            }
        }
        return cnt == 0;
    }
}
