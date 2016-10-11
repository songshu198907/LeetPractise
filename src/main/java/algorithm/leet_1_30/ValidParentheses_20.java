package algorithm.leet_1_30;

import java.util.Stack;

/**
 * Created by songheng on 10/7/16.
 */
public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case '(':
                    stack.push(arr[i]);
                    break;
                case '[':
                    stack.push(arr[i]);
                    break;
                case '{':
                    stack.push(arr[i]);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
