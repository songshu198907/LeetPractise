package algorithm.leet_351_365;

/**
 * Created by songheng on 8/23/16.
 */
public class Count_Numbers_with_Unique_Digits_357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 10;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + getComb(i);
        }
        return arr[n];
    }

    private int getComb(int n) {
        int prod = 9;
        for (int i = 0; i < n - 1 && i <= 9; i++) {
            prod *= (9 - i);
        }
        return prod;
    }
}
