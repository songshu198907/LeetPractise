package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by songheng on 6/8/16.
 */
public class Basic_Calculator_224 {
    public int calculate(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();
        List<String> tokens = getTokens(s);
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("(") || token.equals(")")) {
                if (token.equals("+")) {
                    op.push('+');
                    continue;
                }
                if (token.equals("-")) {
                    op.push('-');
                    continue;
                }
                if (token.equals("(")) {
                    op.push('(');
                    continue;
                }
                int res = num.pop();
                op.pop();
                while (!op.isEmpty() && op.peek() != '(') {
                    switch (op.pop()) {
                        case '+':
                            res = num.pop() + res;
                            break;
                        case '-':
                            res = num.pop() - res;
                            break;
                    }
                }
                num.push(res);
            } else {
                int val = Integer.parseInt(token);
                if (num.isEmpty()) {
                    num.push(val);
                } else {
                    int ops = op.peek();
                    if (ops == '(') {
                        num.push(val);
                    } else {
                        if (ops == '-') {
                            op.pop();
                            val = num.pop() - val;
                            num.push(val);
                        } else {
                            op.pop();
                            val = num.pop() + val;
                            num.push(val);
                        }
                    }
                }
            }
        }


        return num.pop();
    }

    private List<String> getTokens(String str) {
        List<String> tokens = new ArrayList<>();
        int pos = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+'
                    || str.charAt(i) == '-'
                    || str.charAt(i) == '*'
                    || str.charAt(i) == '/'
                    || str.charAt(i) == '('
                    || str.charAt(i) == ')'
                    ) {
                if (i == pos) {
                    pos++;
                    tokens.add(str.substring(i, pos));

                } else {
                    String tmp = str.substring(pos, i).trim();
                    if (!tmp.trim().isEmpty()) {

                        tokens.add(str.substring(pos, i).trim());
                    }
                    pos = i + 1;
                    tokens.add(str.substring(i, pos));

                }


            }
        }
        if (pos < str.length()) {
            String tmp = str.substring(pos).trim();
            if (!tmp.isEmpty())
                tokens.add(tmp);
        }

        return tokens;

    }


}
