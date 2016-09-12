package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public class MenuItem {
    private String name;
    private Cmd command;

    public MenuItem(String name) {
        this.name = name;
    }

    public void setCommand(Cmd command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void execute() {
        command.execute();
    }

    public void click() {
        command.execute();
    }
}
