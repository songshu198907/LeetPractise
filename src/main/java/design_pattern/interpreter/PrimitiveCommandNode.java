package design_pattern.interpreter;

/**
 * Created by songheng on 9/13/16.
 */
public class PrimitiveCommandNode extends Node {

    private String name;
    private String text;

    @Override
    public void interpret(Context context) {
        name = context.getCurrentToken();
        context.skipToken(name);
        if (!name.equalsIgnoreCase("print") && !name.equalsIgnoreCase("break") && !name.equalsIgnoreCase("space")) {
            System.err.println("非法命令！");
        }
        if (name.equalsIgnoreCase("print")) {
            text = context.getCurrentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if (name.equalsIgnoreCase("print")) {
            System.out.print(text);
        } else if (name.equalsIgnoreCase("space")) {
            System.out.print(" ");
        } else if (name.equalsIgnoreCase("break"))
            System.out.println();
    }
}
