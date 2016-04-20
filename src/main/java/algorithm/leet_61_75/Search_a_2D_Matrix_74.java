package algorithm.leet_61_75;

/**
 * Created by songheng on 4/14/16.
 */
public class Search_a_2D_Matrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        if(matrix == null || matrix.length == 0){
            return false;
        }

        for( int i = 0 ; i < rowLen - 1 ; i++){
            if(matrix[i][0]  == target || matrix[i+1][0] == target){
                return  true;
            }
            if(matrix[i][0] < target && matrix[i+1][0] > target){
                if(matrix[i][colLen-1] == target){
                    return true;
                } else if (matrix[i][colLen - 1 ]>target){
                    return searchRow(matrix,i,target);
                } else {
                    return false;
                }
            }
        }
        return searchRow(matrix,rowLen - 1,target);
    }

    private boolean searchRow(int[][] matrix, int row, int target) {
        for(int i = 0 ;i < matrix[row].length  ; i++){
            if(matrix[row][i] == target){
                return true;
            } else if(matrix[row][i] < target){
                continue;
            } else {
                break;
            }
        }
        return false;
    }
}
