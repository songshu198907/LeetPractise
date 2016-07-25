package algorithm.leet_181_320;

/**
 * Created by shu on 7/15/2016.
 */
public class Additive_Number_306 {
    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) return false;
        for (int i = 1; i < (num.charAt(0) != '0' ? Math.ceil(num.length() * 1.0 / 2) : 2); i++)
            for (int j = i + 1; j <= (num.charAt(i) == '0' ? i + 2 : num.length() - 1); j++) {
                String num1 = num.substring(0, i);
                String num2 = num.substring(i, j);
                if (num2.isEmpty() || Math.max(i, num2.length()) > num.length() - j) continue;
                if (helper(num.substring(j), Long.parseLong(num1), Long.parseLong(num2))) return true;
            }
        return false;
    }

    private boolean helper(String num, Long ll, Long l) {
        if (num.isEmpty()) return true;
        Long sum = ll + l;
        String str = String.valueOf(ll + l);
        if (!num.startsWith(str)) return false;
        return helper(num.substring(str.length()), l, sum);
    }
}
