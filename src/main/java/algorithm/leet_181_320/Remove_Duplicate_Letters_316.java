package algorithm.leet_181_320;

import java.util.Stack;

/**
 * Created by songheng on 7/22/16.
 */
public class Remove_Duplicate_Letters_316 {

    public static String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int[] dict = new int[26];
        // initialize
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a'] += 1;
        }
        Stack<Character> stack = new Stack<Character>();
        int i = 0;

        // maintain the sequence, if the next character is better, push it into stack
        while (i < s.length()) {
            char current = s.charAt(i);
            int index = current - 'a';
            // only take care of new characters that are not in the stack
            if (!stack.contains(current)) {
                while (!stack.isEmpty() && current <= stack.peek() && dict[stack.peek() - 'a'] >= 1) {
                    stack.pop();
                }
                if (!stack.contains(current)) {
                    stack.push(current);
                }
            }
            dict[index]--;
            i++;
        }

        // convert stack to result
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

}
