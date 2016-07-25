package algorithm.leet_181_320;

/**
 * Created by shu on 6/20/2016.
 */
public class Search_2D_MatrixII_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int rowLen = matrix.length;
        int coLen = matrix[0].length;
        if (target < matrix[0][0]) return false;
        int row = -1;
        for (int i = 0; i < rowLen; i++) {
            if (matrix[i][coLen - 1] >= target && matrix[i][0] <= target) {
                row = i;
                for (int jj = 0; jj < coLen; jj++) {
                    if (matrix[row][jj] > target) break;
                    if (matrix[row][jj] == target) return true;
                }

            }
        }

        return false;

    }
}
