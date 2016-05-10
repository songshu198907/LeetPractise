package algorithm.leet_106_120;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/10/16.
 */
public class PascalsTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        return helper(new ArrayList<>(),rowIndex+1);
    }

    private List helper(List<Integer> list, int remaining) {
        if (remaining == 0) {
            return list;
        }
        if (list.isEmpty()) {
            list.add(1);
        } else {
            for (int i = 0; i < list.size() - 1 ; i++) {
                list.set(i,list.get(i)+list.get(i+1));
            }
            list.add(0,1);
            list.set(list.size() -1 , 1);
        }
        return helper(list, --remaining);
    }
}
