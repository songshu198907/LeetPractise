package algorithm.leet_370_end;

/**
 * Created by songheng on 8/26/16.
 */
public class Guess_Number_Higher_or_Lower_374 {
    public int guessNumber(int n) {
        Long sum = 0L;
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            sum += mid;
            int val = guess(mid);
            if (val == 0) {
                System.out.println("sum is " + sum);
                return mid;
            }
            if (val < 0) end = mid - 1;
            else start = mid + 1;
        }
        System.out.println("sum is " + sum);
        return start;
    }

    private int guess(Integer num) {
        return -num.compareTo(2560834);
    }
}
