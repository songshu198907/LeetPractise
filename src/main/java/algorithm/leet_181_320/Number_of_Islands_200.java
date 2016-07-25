package algorithm.leet_181_320;

/**
 * Created by songheng on 5/23/16.
 */
public class Number_of_Islands_200 {
    public int numIslands(char[][] grid) {
        int rowLen = grid.length;
        if (rowLen == 0)
            return 0;
        int coLen = grid[0].length;
        if (coLen == 0)
            return 0;
        int isLands = 0;
        int[][] support = new int[rowLen][coLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < coLen; j++) {
                if (grid[i][j] == '1') {
                    if (support[i][j] == 0) {
                        isLands++;
                        helper(i, j, grid, support, rowLen, coLen);
                    } else {
                        continue;
                    }
                }
                support[i][j] = 1;
            }
        }


        return isLands;
    }

    private void helper(int i, int j, char[][] grids, int[][] support, int rowLen, int coLen) {
        if (grids[i][j] == '1') {
            support[i][j] = 1;
            if (i > 0 && support[i - 1][j] != 1) {
                helper(i - 1, j, grids, support, rowLen, coLen);
            }
            if (i < rowLen - 1 && support[i + 1][j] != 1) {
                helper(i + 1, j, grids, support, rowLen, coLen);
            }
            if (j > 0 && support[i][j - 1] != 1) {
                helper(i, j - 1, grids, support, rowLen, coLen);
            }
            if (j < coLen - 1 && support[i][j + 1] != 1)
                helper(i, j + 1, grids, support, rowLen, coLen);

        } else {
            return;
        }
    }
}
