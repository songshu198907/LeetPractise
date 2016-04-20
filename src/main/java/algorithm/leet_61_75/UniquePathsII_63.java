package algorithm.leet_61_75;

/**
 * Created by songheng on 3/30/16.
 */
public class UniquePathsII_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] res = new int[obstacleGrid[0].length];
        if(obstacleGrid.length < 1 || obstacleGrid[0].length < 1){
            return  0;
        }
        for(int row = 0 ; row < obstacleGrid.length; row++){
            if(obstacleGrid[row][0] == 1){
                res[0] = 0;
            }
            for(int col = 1 ; col < res.length ; col++){
                res[col] += res [col -1];
                if(obstacleGrid[row][col] == 1){
                    res[col] = 0;
                }
            }
        }
        return res[res.length -1 ];
    }
}
