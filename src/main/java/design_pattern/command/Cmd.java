package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public abstract class Cmd {
    protected String cmdName;
    protected BroadScreen broadScreen;

    public Cmd(String cmdName) {
        this.cmdName = cmdName;
    }

    protected void setBroadScreen(BroadScreen broadScreen) {
        this.broadScreen = broadScreen;
    }

    public abstract void execute();
}
