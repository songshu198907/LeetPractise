package design_pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 9/12/16.
 */
public class Menu {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        items.add(item);

    }

    public MenuItem getItem(int i) {
        return items.get(i);
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
