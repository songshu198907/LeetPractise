package design_pattern.builder;

/**
 * Created by songheng on 8/30/16.
 */
public class MemPlayerBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {
        System.out.println("233");
    }

    @Override
    public void buildMainFrame() {
        System.out.println("Main Frame is created!");
    }

    @Override
    public void buildBookBar() {
        System.out.println("Book bar is created!");
    }

    @Override
    public void buildList() {
        System.out.println("233");
    }

    @Override
    public void buildController() {
        System.out.println("controller is created");

    }

    @Override
    public boolean isMemo() {
        return true;
    }
}
