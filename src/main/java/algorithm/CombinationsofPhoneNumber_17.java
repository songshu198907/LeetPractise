package algorithm;

import java.util.*;

/**
 * Created by songheng on 3/17/16.
 */
public class CombinationsofPhoneNumber_17 {
    public List<String> letterCombinations(String digits) {
        String[][] phone =
                {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {
                        "m", "n", "o"
                }, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}
                };
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] current = phone[digits.charAt(0) - '2'];
        if (digits.length() == 1) {
            int pos = digits.charAt(0) - '2';
            return Arrays.asList(phone[pos]);
        } else {

            for (int i = 1; i < digits.length() ; i++) {
                int pos = digits.charAt(i) - '2';
                current = combineArray(current, phone[pos]);
            }
        }
        return Arrays.asList(current);

    }

    private String[] combineArray(String[] arr1, String[] arr2) {
        Set result = new TreeSet<>();
        for (String str1 : arr1) {
            for (String str2 : arr2) {
                result.add(str1 + str2);
            }
        }
        String[] arr = new String[result.size()];
        result.toArray(arr);
        return arr;

    }
}
