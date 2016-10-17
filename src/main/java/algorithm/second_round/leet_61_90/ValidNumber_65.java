package algorithm.second_round.leet_61_90;

/**
 * Created by shu on 2016-10-15.
 */
public class ValidNumber_65 {
    public boolean isNumber(String s) {
        int len = s.length();
        int start = 0, end = len - 1;
        char[] arr = s.toCharArray();
        while (start <= end && Character.isWhitespace(arr[start])) start++;
        while (end >= start && Character.isWhitespace(arr[end])) end--;
        if (arr[start] == '+' || arr[start] == '-') start++;
        boolean num = false;
        boolean dot = false;
        boolean exp = false;
        while (start <= end) {
            if (Character.isDigit(arr[start])) num = true;
            else if (arr[start] == '.') {
                if (exp || dot) return false;
                dot = true;
            } else if (arr[start] == 'e') {
                if (exp || num == false) return false;
                exp = true;
            } else if (arr[start] == '+' || arr[start] == '-') {
                if (arr[start - 1] != 'e') return false;
            } else {
                return false;
            }
            start++;
        }
        return num;
    }
}
