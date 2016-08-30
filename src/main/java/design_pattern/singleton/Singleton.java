package design_pattern.singleton;

/**
 * Created by shu on 6/21/2016.
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }
}
