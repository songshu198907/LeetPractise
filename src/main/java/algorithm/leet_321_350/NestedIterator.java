package algorithm.leet_321_350;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songheng on 8/19/16.
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> list;
    int cnt = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        for (NestedInteger integer : nestedList) {
            list.addAll(loadVal(integer));
        }
    }

    private List<Integer> loadVal(NestedInteger integer) {
        List<Integer> list = new ArrayList<>();
        if (integer.isInteger()) {
            list.add(integer.getInteger());
        } else {
            List<NestedInteger> datas = integer.getList();
            for (NestedInteger data : datas) {
                list.addAll(loadVal(data));
            }
        }
        return list;
    }

    @Override
    public boolean hasNext() {
        return cnt < list.size();
    }

    @Override
    public Integer next() {
        return list.get(cnt++);
    }
}
