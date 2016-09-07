package design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 9/7/16.
 */
public class MiddleWare extends Component {
    private List<Component> children;

    public MiddleWare() {
        children = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        children.add(component);

    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component get(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println("使用　中间面板　组件！");
        for (Component child : children) {
            child.operation();

        }

    }
}
