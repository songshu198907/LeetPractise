package design_pattern.interpreter;

import java.util.StringTokenizer;

/**
 * Created by songheng on 9/13/16.
 */
public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        currentToken = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : null;
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("错误提示：　" + currentToken + "解释错误！");
        }
        nextToken();
    }

    public int currentNumber() {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (Exception e) {
            System.err.println("错误提示: " + e);
        }
        return number;
    }
}
