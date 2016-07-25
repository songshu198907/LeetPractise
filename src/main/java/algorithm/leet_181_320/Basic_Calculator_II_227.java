package algorithm.leet_181_320;

import java.util.LinkedList;

/**
 * Created by shu on 6/13/2016.
 */
public class Basic_Calculator_II_227 {
    public int calculate(String s) {
        s = s.trim();
        LinkedList<Integer> number = new LinkedList<>();
        LinkedList<Character> op = new LinkedList<>();
        int pos = 0;
        while (pos < s.length()) {
            while (s.charAt(pos) == ' ') {
                pos++;
            }
            if (s.charAt(pos) == '+' || s.charAt(pos) == '-' || s.charAt(pos) == '*' || s.charAt(pos) == '/') {
                op.push(s.charAt(pos));
                pos++;
            } else {
                int i = 0;
                while (pos + i < s.length() && Character.isDigit(s.charAt(pos + i))) {
                    i++;
                }
                String num = s.substring(pos, pos + i);
                number.push(Integer.parseInt(num));
                if (!op.isEmpty() && op.peek() == '*') {
                    int num2 = number.pop();
                    int num1 = number.pop();
                    number.push(num1 * num2);
                    op.pop();
                } else if (!op.isEmpty() && op.peek() == '/') {
                    int num2 = number.pop();
                    int num1 = number.pop();
                    number.push(num1 / num2);
                    op.pop();
                }
                pos += i;
            }
        }
        int cnt = 0;
        int res = number.get(cnt++);
        while (!op.isEmpty()) {
            char ch = op.pop();
            if (ch == '+') {
                res += number.get(cnt++);
            } else {
                res -= number.get(cnt++);
            }
        }

        return res;
    }
}
