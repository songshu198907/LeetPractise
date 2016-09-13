package design_pattern.interpreter.practise;

/**
 * Created by songheng on 9/13/16.
 */
public class MoveNode extends Node {
    private Node node;
    private String tableName;

    @Override
    public void interpret(Context context) {
        int count = 0;
        while (true) {
            if (context.getCurrentToken() == null) {
                break;
            }
            if (count == 2) {
                tableName = context.getCurrentToken();
                context.nextToken();
            } else {
                if (context.getCurrentToken().equalsIgnoreCase("from ")) {
                    context.nextToken();
                    node = new TableNode();
                    node.interpret(context);
                    break;
                }
            }
        }

    }

    @Override
    public void execute() {
        System.out.println("表：　" + tableName + " 移动从 ");
        node.execute();

    }
}
