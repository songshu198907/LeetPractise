package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/21/16.
 */
public class GenerateParentheses_22 {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        if (n <= 0) {
            result.add("");
            return result;
        }
        String cur = "(";
        int front = n - 1;
        int back = n - 1;
        int sum = 1;
        List<String> tmp = buildParenthesis(sum, front, back);
        tmp.stream().forEach(ele ->
                result.add(cur + ele)
        );
        tmp = null;


        return result;

    }

    public List<String> buildParenthesis(int sum, int front, int back) {
        List<String> result = new ArrayList<>();
        if (front > 0 && back > 0) {
            if (sum == 0) {
                String cur = "(";
                sum++;
                front--;

                List<String> tmp = buildParenthesis(sum, front, back);
                for (String str : tmp) {
                    result.add(cur + str);
                }
                tmp = null;
            } else {
                /** When chose '(' as current character **/
                String cur = "(";


                List<String> tmp = buildParenthesis(sum + 1, front - 1, back);
                for (String str : tmp) {
                    result.add(cur + str);
                }
                cur = ")";
                tmp = buildParenthesis(sum - 1, front, back - 1);

                for (String str : tmp) {
                    result.add(cur + str);
                }
                tmp = null;

            }


        } else if (front > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < front; i++) {
                sb.append("(");

            }
            sb.append(")"); // the last one must be ')'
            result.add(sb.toString());
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < back; i++) {
                sb.append(")");

            }
            sb.append(")");
            result.add(sb.toString());
        }
        return result;

    }

    public List<String> generateParenthesisBetter(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            result.add("");
            return result;

        } else {
            helper(result, "", n, n);
            return result;
        }

    }

    public void helper(List<String> list, String patt, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(patt);

        } else {
            if (left > 0) {
                helper(list, patt + "(", left - 1, right);
            }
            if (right > 0 && right > left) {
                helper(list, patt + ")", left, right - 1);
            }

        }
    }

}
