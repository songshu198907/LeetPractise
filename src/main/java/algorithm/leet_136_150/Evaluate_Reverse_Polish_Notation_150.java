package algorithm.leet_136_150;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by shu on 5/16/2016.
 */
public class Evaluate_Reverse_Polish_Notation_150 {
    public int evalRPN(String[] tokens) {
        Map<String, Integer> operands = new HashMap<>();
        int res = 0 ;
        operands.put("+",1);
        operands.put("-",1);
        operands.put("*",2);
        operands.put("/",2);
        LinkedList<Integer> number = new LinkedList<>();
        LinkedList<String> op = new LinkedList<>();
        boolean prev = false;
        for (String token : tokens) {
            token = token.trim();
            if (operands.containsKey(token)) {
                int num2 = number.poll();
                int num1 = number.poll();
                int tmp = 0;
                switch (token) {
                    case "+":
                        tmp = num1+num2;
                        break;
                    case "-":
                        tmp = num1-num2;
                        break;
                    case "*":
                        tmp = num1*num2;
                        break;
                    case "/":
                        tmp = num1 / num2;
                }
                number.push(tmp);
            } else {
                number.push(Integer.parseInt(token));
            }
        }
        return number.poll();
    }
}
