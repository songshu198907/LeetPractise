package algorithm.leet_1_30;

/**
 * Created by shu on 2016/10/4.
 */
public class ZigZagConversion_6 {
    public String convert(String s, int numRows) {
        if (s.isEmpty() || numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += numRows * 2 - 2) {
            sb.append(arr[i]);
        }
        int line = 0;
        for (int i = 1; i < numRows - 1; i++) {
            int n = i;
            int dis = (numRows - i - 1) << 1;
            while (n < arr.length) {
                sb.append(arr[n]);
                if (n + dis < arr.length)
                    sb.append(arr[n + dis]);
                n += numRows * 2 - 2;
            }


        }

        for (int i = numRows - 1; i < arr.length; i += numRows * 2 - 2) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
