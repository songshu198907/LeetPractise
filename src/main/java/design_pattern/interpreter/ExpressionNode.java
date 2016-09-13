package design_pattern.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songheng on 9/13/16.
 */
public class ExpressionNode extends Node {
    private List<Node> list = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (true) {
            if (context.getCurrentToken() == null) {
                break;
            } else if (context.getCurrentToken().equalsIgnoreCase("end")) {
                context.skipToken("END");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public void execute() {
        Iterator<Node> it = list.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }
}
