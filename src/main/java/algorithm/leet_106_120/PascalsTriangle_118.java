package algorithm.leet_106_120;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/10/16.
 */
public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows > 0) {
            build(result, new ArrayList<>(), numRows);
        }
        return result;
    }

    private void build(List<List<Integer>> lists, List<Integer> prev, int remaining) {
        if (remaining == 0) {
            return;
        }
        List<Integer> line = new ArrayList<>();
        line.add(1);
        for (int i = 0; i < prev.size() - 1; i++) {
            line.add(prev.get(i) + prev.get(i + 1));
        }
        if (!prev.isEmpty()) {
            line.add(1);
        }
        lists.add(line);
        build(lists, line, --remaining);


    }
}
