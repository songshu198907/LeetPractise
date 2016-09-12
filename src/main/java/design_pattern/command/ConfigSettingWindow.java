package design_pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 9/12/16.
 */
public class ConfigSettingWindow {
    private List<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        FileUtil.writeCommands(commands);
    }

    public void recovery() {
        List list;
        list = FileUtil.readCommands();
        for (Object obj : list) {
            ((Command) obj).execute();
        }
    }
}
