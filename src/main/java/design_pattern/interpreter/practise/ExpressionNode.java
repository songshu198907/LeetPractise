package design_pattern.interpreter.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 9/13/16.
 */
public class ExpressionNode extends Node {
    private List<Node> list = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        Node node = null;
        while (true) {
            if (context.getCurrentToken() == null) {
                break;
            }
            if (context.getCurrentToken().equalsIgnoreCase("copy")) {
                node = new CopyNode();
                node.interpret(context);

            } else if (context.getCurrentToken().equalsIgnoreCase("move")) {
                node = new MoveNode();
                node.interpret(context);
            }
            list.add(node);
        }

    }

    @Override
    public void execute() {
        list.forEach(node -> node.execute());

    }
}
