package design_pattern.singleton;

/**
 * Created by shu on 6/21/2016.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            init();
        }
        return instance;
    }

    private static synchronized void init() {
        instance = new Singleton();
    }


}
