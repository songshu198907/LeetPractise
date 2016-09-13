package design_pattern.interpreter;

/**
 * Created by songheng on 9/13/16.
 */
public abstract class Node {
    public abstract void interpret(Context context);

    public abstract void execute();
}
