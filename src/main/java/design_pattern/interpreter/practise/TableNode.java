package design_pattern.interpreter.practise;

/**
 * Created by songheng on 9/13/16.
 */
public class TableNode extends Node {
    private String src;
    private String dst;

    @Override
    public void interpret(Context context) {
        int cnt = 0;
        while (cnt < 3) {
            if (context.getCurrentToken() == null) {
                System.err.println("发生错误　：" + cnt);
            }
            if (cnt == 0) {
                src = context.getCurrentToken();
                context.nextToken();
            } else if (cnt == 1) {
                assert context.getCurrentToken().equalsIgnoreCase("to");
                context.nextToken();
            } else {
                dst = context.getCurrentToken();
                context.nextToken();
            }
            cnt++;

        }
    }

    @Override
    public void execute() {
        System.out.println("从　" + src + " 到　" + dst);

    }
}
