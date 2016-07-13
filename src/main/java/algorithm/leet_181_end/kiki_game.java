package algorithm.leet_181_end;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shu on 7/12/2016.
 */
public class kiki_game {
    public String check(int n, int m) {
        int[][] matrix = new int[n][m];
        int[][] g = new int[n][m];
        for (int i = n - 1; i >= 0; i--)
            for (int j = m - 1; j >= 0; j--) {
                Set<Integer> set = new HashSet<>();
                int res = 0;
                if (j - 1 >= 0)
                    set.add(matrix[i][j - 1]);
                if (i - 1 >= 0) {
                    set.add(matrix[i - 1][j]);
                    if (j - 1 >= 0)
                        set.add(matrix[i - 1][j - 1]);

                }
                g[i][j] = mex(set);
            }
        int final_res = 0;
        for (int i = n - 1; i >= 0; i--)
            for (int j = m - 1; j >= 0; j--)
                final_res ^= g[i][j];
        return final_res != 0 ? "Wonderful" : "What a pity";
    }

    private int mex(Set<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(i)) return i;
        }
        return set.size();
    }
}
