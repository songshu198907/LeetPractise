package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 3/17/16.
 */
public class RomantoInteger_13 {
    public int romanToInt(String s) {
//
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = s.length() - 1; i >= 0; ) {

            int curr = map.get(s.charAt(i));
            int previous = i >= 1 ? map.get(s.charAt(i - 1)) : 10000;
            if (curr <= previous) {
                res += curr;
                i--;

            } else {
                int tmp = curr - previous;
                res += tmp;
                i = i - 2;


            }

        }
        return res;

    }

    ;
}
