package design_pattern.command;

/**
 * Created by songheng on 9/12/16.
 */
public class Client {
    public static void main(String[] args) {
//        ConfigSettingWindow window = new ConfigSettingWindow();
//        Command command;
//        ConfigOperator co = new ConfigOperator();
//
//        command = new InsertCommand("增加");
//        command.setConfigOperator(co);
//        window.setCommand(command);
//        window.call("首页");
//
//        command = new InsertCommand("增加");
//        command.setConfigOperator(co);
//        window.setCommand(command);
//        window.call("端口号");
//
//        command = new ModifiedCommand("修改");
//        command.setConfigOperator(co);
//        window.setCommand(command);
//        window.call("首页");
//
//        command = new ModifiedCommand("修改");
//        command.setConfigOperator(co);
//        window.setCommand(command);
//        window.call("端口号");
//
//        System.out.println("-------------------------------------");
//        System.out.println("保存配置");
//        window.save();
//
//        System.out.println("-------------------------------------");
//        System.out.println("恢复配置");
//        System.out.println("-------------------------------------");
//        window.recovery();
        MenuItem item = new MenuItem("菜单项");
        Cmd command;
        BroadScreen broadScreen = new BroadScreen();

        command = new CreateCommand("创建");
        command.setBroadScreen(broadScreen);
        item.setCommand(command);
        item.click();

        command = new OpenCommand("打开");
        command.setBroadScreen(broadScreen);
        item.setCommand(command);
        item.click();

        command = new EditCommand("编辑");
        command.setBroadScreen(broadScreen);
        item.setCommand(command);
        item.click();

    }
}
