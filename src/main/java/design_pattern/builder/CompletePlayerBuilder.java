package design_pattern.builder;

/**
 * Created by songheng on 8/30/16.
 */
public class CompletePlayerBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {
        System.out.println("Menu is created. ");
    }

    @Override
    public void buildMainFrame() {
        System.out.println("buildMainFrame is created. ");
    }

    @Override
    public void buildBookBar() {
        System.out.println("2333");
    }

    @Override
    public void buildList() {
        System.out.println("List is created ! ");
    }

    @Override
    public void buildController() {
        System.out.println("Controller is created .");
    }
}
