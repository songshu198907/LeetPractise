package design_pattern.interpreter.practise;

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

    private void skipToker(String token) {
        if (!token.equalsIgnoreCase(currentToken)) {
            System.err.println("错误提示：" + token + "　解释失败");
        }
        nextToken();
    }
}
