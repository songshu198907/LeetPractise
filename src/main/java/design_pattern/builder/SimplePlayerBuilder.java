package design_pattern.builder;

/**
 * Created by songheng on 8/30/16.
 */
public class SimplePlayerBuilder extends PlayerBuilder {

    @Override
    public void buildMenu() {
        System.out.println("abc");

    }

    @Override
    public void buildMainFrame() {
        System.out.println("Main Frame is created !");

    }

    @Override
    public void buildBookBar() {
        System.out.println("abc");

    }

    @Override
    public void buildList() {
        System.out.println("abc");
    }

    @Override
    public void buildController() {
        System.out.println("Controller is created.");
    }

    @Override
    public boolean isSimple() {
        return true;
    }
}
