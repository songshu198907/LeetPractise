package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0 ){
            return list;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int remaining = row * col;
        helper(list,matrix,remaining,row,col);
        return list;

    }
    private void helper(List<Integer> lists, int[][] matrix , int total ,int rows , int cols){
        int[][] support = new int[rows][cols];
        int operation = 0 , direction = 4;
        int row = 0 , col = 0 ;
        while( total > 0 ){
            if(operation == 0 ){
                while(col < cols && support[row][col] == 0 ){
                    support[row][col] = 1;
                    lists.add(matrix[row][col]);
                    col++;
                    total -- ;
                }
                col -- ;
                row ++;
                operation = (operation + 1) % direction;
            } else if(operation == 1 ){
                while(row < rows && support[row][col] == 0 ){
                    support[row][col] = 1;
                    lists.add(matrix[row][col]);
                    row++;
                    total -- ;
                }
                row -- ;
                col -- ;
                operation = (operation + 1) % direction;
            } else  if(operation == 2 ){
                while(col >= 0 && support[row][col] == 0 ){
                    support[row][col] = 1;
                    lists.add(matrix[row][col]);
                    col--;
                    total -- ;
                }
                col ++;
                row -- ;
                operation = (operation + 1) % direction;
            } else {

                while( row >= 0 && support[row][col] == 0){
                    support[row][col] = 1;
                    lists.add(matrix[row][col]);
                    row --;
                    total--;
                }
                row++;
                col++;
                operation = (operation+1)%direction;
            }

        }
    }


}
