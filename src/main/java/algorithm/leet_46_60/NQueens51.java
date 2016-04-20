package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/28/16.
 */
public class NQueens51 {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        List<int[]> tmp = new ArrayList<>();
        helper(result, tmp, 0, n, n);

        return result;

    }

    public void helper(List<List<String>> results, List<int[]> tmp, int row, int remaining, int n) {
        if (remaining == 0) {
            int curRow = 0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                int[] pos = tmp.get(curRow);
                for (int j = 0; j < n; j++) {
                    if (i == pos[0] && j == pos[1]) {
                        sb.append("Q");
                        curRow = curRow + 1 > tmp.size() ? tmp.size() - 1 : curRow + 1;
                    } else {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            results.add(list);

        }


        for (int i = row; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int[] last = new int[]{
                        i, j
                };
                if (!tmp.contains(last)) {
                    if (isValid(last, tmp)) {
                        List<int[]> round = new ArrayList<>(tmp);
                        round.add(last);
                        helper(results, round, i + 1, remaining - 1, n);

                    }
                }


            }
        }

    }

    private boolean isValid(int[] last, List<int[]> tmp) {
        for (int[] arr : tmp) {
            if (!validTwo(last, arr)) {
                return false;
            }
        }
        return true;

    }

    private boolean validTwo(int[] last, int[] origin) {
        if (last[0] == origin[0]) {
            return false;
        }
        if (last[1] == origin[1]) {
            return false;
        }
        if ((last[1] - origin[1]) == (last[0] - origin[0])) {
            return false;
        }
        if ((last[1] - origin[1]) + (last[0] - origin[0]) == 0) {
            return false;
        }
        return true;
    }
}
