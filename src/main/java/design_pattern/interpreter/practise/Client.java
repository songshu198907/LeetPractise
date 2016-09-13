package design_pattern.interpreter.practise;

/**
 * Created by songheng on 9/13/16.
 */
public class Client {
    public static void main(String[] args) {
        String text = "COPY VIEW FROM 不知所措 TO 兔不理";
        Context context = new Context(text);
        Node node = new ExpressionNode();
        node.interpret(context);
        node.execute();
    }
}
