package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by songheng on 7/13/16.
 */
public class Best_Meeting_Point_296 {
    public int minTotalDistance(int[][] grid) {
        int sum = 0;
        int rowLen = grid.length;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < rowLen; i++) {
            int coLen = grid[i].length;
            for (int j = 0; j < coLen; j++) {
                if (grid[i][j] == 1) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (int i = 0; i < x.size(); i++) {
            sum += Math.abs(x.get(i) - x.get(x.size() / 2));
        }
        Collections.sort(y);
        for (int i = 0; i < y.size(); i++) {
            sum += Math.abs(y.get(i) - y.get(y.size() / 2));
        }
        return sum;
    }
}
