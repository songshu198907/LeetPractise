package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public class ModifiedCommand extends Command {

    public ModifiedCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(args);
    }
}
