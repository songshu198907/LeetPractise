package design_pattern.builder;

/**
 * Created by songheng on 8/30/16.
 */
public class PlayerController {

    public Player consruct(PlayerBuilder builder) {
        if (!builder.isSimple() && !builder.isMemo()) {
            builder.buildMenu();
            builder.buildList();
        }
        builder.buildMainFrame();
        builder.buildController();
        if (builder.isMemo()) {
            builder.buildBookBar();
        }
        return builder.getPlayer();
    }

}
