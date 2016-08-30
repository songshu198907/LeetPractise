package design_pattern.builder;

/**
 * Created by songheng on 8/30/16.
 */
public abstract class PlayerBuilder {

    private Player player = new Player();

    public abstract void buildMenu();

    public abstract void buildMainFrame();

    public abstract void buildBookBar();

    public abstract void buildList();

    public abstract void buildController();

    public boolean isSimple() {
        return false;
    }

    public boolean isMemo() {
        return false;
    }

    public Player getPlayer() {
        return player;
    }
}
