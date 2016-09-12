package design_pattern.command;

import java.io.Serializable;

/**
 * Created by songheng on 9/12/16.
 */
public abstract class Command implements Serializable {
    protected String name;
    protected String args;
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute(String args);

    public abstract void execute();
}
