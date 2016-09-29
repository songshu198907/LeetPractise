package algorithm.leet_370_end;

import java.util.Stack;

/**
 * Created by shu on 2016/9/28.
 */
public class DecodeString_394 {
    public String decodeString(String s) {
        String str = "";
        Stack<String> strings = new Stack<>();
        Stack<Integer> loops = new Stack<>();
        char[] arr = s.toCharArray();
        int start = 0;
        for (int i = 0; i < arr.length; ) {
            while (i < arr.length && Character.isAlphabetic(arr[i])) {
                i++;
            }
            if (i > start) {
                str += s.substring(start, i);
                start = i;
            }
            while (i < arr.length && Character.isDigit(arr[i])) {
                i++;
            }
            if (i > start) {
                String nums = s.substring(start, i);
                strings.push(str);
                int loop = Integer.parseInt(nums);
                loops.push(loop);
                start = i;
            }
            if (i < s.length() && arr[i] == '[') {
                str = "";
                start = ++i;
            }
            if (i < s.length() && arr[i] == ']') {
                String repeated = repeated(str, loops.pop());
                str = strings.pop() + repeated;
                start = ++i;
            }

        }

        return str;
    }

    private String repeated(String word, int loop) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            sb.append(word);
        }
        return sb.toString();
    }
}
