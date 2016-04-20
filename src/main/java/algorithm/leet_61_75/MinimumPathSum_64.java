package algorithm.leet_61_75;

/**
 * Created by songheng on 3/30/16.
 */
public class MinimumPathSum_64 {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] arr = new int[cols];
        arr[0] = grid[0][0];
        for ( int i = 1 ; i < cols; i++){
            arr[i] = arr[i-1] + grid[0][i];
        }
        for(int row = 1 ; row < rows ; row++){
            arr[0] += grid[row][0];
            for(int col = 1; col < cols ;col++){
                arr[col] = Math.min(arr[col - 1 ] , arr[col]) + grid[row][col];
            }
        }
        return arr[cols - 1];
    }
}
