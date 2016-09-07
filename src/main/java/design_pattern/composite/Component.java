package design_pattern.composite;

/**
 * Created by songheng on 9/7/16.
 */
public abstract class Component {
    public void add(Component component) {
        System.err.println("不支持该操作！");
    }

    public void remove(Component component) {
        System.err.println("不支持该操作！");
    }

    public abstract void operation();

    public Component get(int i) {
        System.err.println("不支持该操作！");
        return null;
    }
}
