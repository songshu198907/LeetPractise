package algorithm.leet_46_60;

/**
 * Created by songheng on 3/28/16.
 */
public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        for (int i = 0, j = matrix.length-1; i < j; i++, j--)
        {
            for (int k = i, d = j; k < j; k++, d--)
            {
                int t = matrix[i][k];
                matrix[i][k] = matrix[d][i];
                matrix[d][i] = matrix[j][d];
                matrix[j][d] = matrix[k][j];
                matrix[k][j] = t;
            }
        }
    }
}
