package design_pattern.interpreter;

/**
 * Created by songheng on 9/13/16.
 */
public class LoopCommandNode extends Node {
    private int number;
    private Node commandNode;


    @Override
    public void interpret(Context context) {

        context.skipToken("LOOP");
        number = context.currentNumber();
        context.nextToken();
        commandNode = new ExpressionNode();
        commandNode.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++) {
            commandNode.execute();
        }
    }
}
