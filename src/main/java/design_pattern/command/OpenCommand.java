package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public class OpenCommand extends Cmd {
    public OpenCommand(String cmdName) {
        super(cmdName);
    }

    @Override
    public void execute() {
        broadScreen.open();
    }
}
