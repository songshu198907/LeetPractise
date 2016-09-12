package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public class CreateCommand extends Cmd {
    public CreateCommand(String cmdName) {
        super(cmdName);
    }

    @Override
    public void execute() {
        broadScreen.create();
    }
}
