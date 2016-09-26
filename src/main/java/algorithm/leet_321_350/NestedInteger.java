package algorithm.leet_321_350;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 8/19/16.
 */
public class NestedInteger {
    private List<NestedInteger> list;
    private int val;

    public NestedInteger() {
        list = new ArrayList<>();
    }

    public NestedInteger(int val) {
        this.val = val;
    }

    public boolean isInteger() {
        return list == null;
    }


    public Integer getInteger() {
        return val;
    }

    public void setInteger(int value) {
        this.val = value;
    }

    public List<NestedInteger> getList() {
        return list;
    }

    public void add(NestedInteger ni) {
        if (list != null) {
            list.add(ni);
        }
    }
}
