package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by songheng on 3/29/16.
 */
public class NQueensII_52 {int res;
    public int totalNQueens(int n) {
        res = 0;
        if(n<=0)
            return res;

        int [] columnVal = new int[n];

        DFS_helper(n,0,columnVal);
        return res;
    }

    public void DFS_helper(int nQueens, int row, int[] columnVal){
        if(row == nQueens){
            res += 1;
        }else{
            for(int i = 0; i < nQueens; i++){
                columnVal[row] = i;//(row,columnVal[row)==>(row,i)

                if(isValid(row,columnVal))
                    DFS_helper(nQueens, row+1, columnVal);
            }
        }
    }

    public boolean isValid(int row, int [] columnVal){
        for(int i = 0; i < row; i++){
            if(columnVal[row] == columnVal[i]
                    ||Math.abs(columnVal[row]-columnVal[i]) == row-i)
                return false;
        }
        return true;
    }
}
