package algorithm.leet_370_end;

import java.util.ArrayList;

/**
 * Created by shu on 2016/9/30.
 */
public class Remove_K_Digits_402 {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        for (int i = 0; i < k; i++) {
            num = remove(num);
        }
        ArrayList<Integer> ll;
        int i = 0;
        while (i < num.length() && num.charAt(i) == '0') i++;
        num = num.substring(i);
        return num.isEmpty() ? "0" : num;

    }

    private String remove(String num) {
        char[] arr = num.toCharArray();
        int pre = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            if ((arr[i] - '0') < pre) {
                break;
            }
            pre = arr[i] - '0';
        }
        return num.substring(0, i - 1) + (i < arr.length ? num.substring(i) : "");

    }
}
