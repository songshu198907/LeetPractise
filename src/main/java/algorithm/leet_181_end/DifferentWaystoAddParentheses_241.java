package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 6/20/2016.
 */
public class DifferentWaystoAddParentheses_241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        if ((input = input.trim()).isEmpty()) return result;
        List<Integer> op, num;
        op = new ArrayList<>();
        num = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') continue;
            start = i;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                i++;
            }
            if (i > start) {
                String numString = input.substring(start, i);
                i--;
                num.add(Integer.parseInt(numString));
            } else {
                switch (input.charAt(i)) {
                    case '+':
                        op.add(0);
                        break;
                    case '-':
                        op.add(1);
                        break;
                    case '*':
                        op.add(2);
                        break;
                    case '/':
                        op.add(3);
                        break;
                }
            }
        }

        helper(result, num, op);
        return result;
    }

    private void helper(List<Integer> result, List<Integer> number, List<Integer> op) {
        if (op.isEmpty()) {
            result.add(number.get(0));
            return;
        }
        for (int i = 0; i < op.size(); i++) {
            int opand = op.get(i);
            int num1 = number.get(i);
            int num2 = number.get(i + 1);
            int res = 0;
            switch (opand) {
                case 0:
                    res = num1 + num2;
                    break;
                case 1:
                    res = num1 - num2;
                    break;
                case 2:
                    res = num1 * num2;
                    break;
                case 3:
                    res = num1 / num2;
                    break;
            }
            number.set(i, res);
            number.remove(i + 1);
            op.remove(i);
            helper(result, number, op);
            number.set(i, num1);
            number.add(i + 1, num2);
            op.add(i, opand);
        }
    }

}
