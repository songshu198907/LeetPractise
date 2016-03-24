package algorithm.leet_31_45;

import java.util.Stack;

/**
 * Created by songheng on 3/23/16.
 */
public class LongestValidParentheses_32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int max = 0;
        for (int pos = 0; pos < s.length(); pos++) {
            if (s.charAt(pos) == '(') {
                stack.push(pos);
            } else {
                if (stack.isEmpty()) {
                    start = pos + 1;

                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        max = Math.max(max, pos - start + 1);
                    } else {
                        max = Math.max(max, pos - stack.peek());
                    }
                }

            }
        }
        return max;
    }
}
