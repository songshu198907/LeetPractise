package design_pattern.interpreter.practise;

/**
 * Created by songheng on 9/13/16.
 */
public class CopyNode extends Node {
    private Node node;

    @Override
    public void interpret(Context context) {
        while (true) {
            if (context.getCurrentToken() == null) {
                break;
            }
            if (context.getCurrentToken().equalsIgnoreCase("from")) {
                context.nextToken();
                node = new TableNode();
                node.interpret(context);
                break;
            } else {
                context.nextToken();
            }
        }
    }

    @Override
    public void execute() {
        System.out.println("拷贝表　：");
        node.execute();

    }
}
