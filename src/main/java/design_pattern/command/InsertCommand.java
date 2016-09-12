package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public class InsertCommand extends Command {

    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    @Override
    public void execute() {
        configOperator.insert(args);
    }
}
