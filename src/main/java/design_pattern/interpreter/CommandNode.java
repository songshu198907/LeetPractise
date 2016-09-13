package design_pattern.interpreter;

/**
 * Created by songheng on 9/13/16.
 */
public class CommandNode extends Node {
    private Node node;

    @Override
    public void interpret(Context context) {
        if (context.getCurrentToken().equalsIgnoreCase("loop")) {
            node = new LoopCommandNode();
            node.interpret(context);
        } else {
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
