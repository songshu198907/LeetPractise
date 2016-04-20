package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by songheng on 3/29/16.
 */
public class NQueen51_3 {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmp.add("");
        }
        Set<int[]> nodes = new HashSet<>();
        List<Integer> cols = new ArrayList<>();
        helper(result, tmp, cols, nodes, n, 0);


        return result;

    }

    private void helper(List<List<String>> lists, List<String> previous, List<Integer> cols, Set<int[]> nodes, int n, int row) {
        for(int i = 0 ; i < n ; i++){
            if(cols.contains(i)){
                continue;
            } else if(!isValid(new int[]{row,i},nodes)){
                continue;
            } else {

                List<String> pattern = new ArrayList<>(previous);
                pattern.set(row,genString(n,i));
                if(row == n-1){
                    lists.add(pattern);
                    return;
                }
                List<Integer> newCols = new ArrayList<>(cols);
                newCols.add(i);
                Set<int[]> nNOdes = new HashSet<>(nodes);
                nNOdes.add(new int[]{row,i});
                helper(lists,pattern,newCols,nNOdes,n,row + 1);
            }
        }
    }

    private boolean isValid(int[] last, Set<int[]> tmp) {
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
    private List<Integer> getOccupied(int row, List<int[]> nodes,int n ){
        List<Integer> list = new ArrayList<>();
        for( int[] node : nodes ){
            int col ;
             if( (col = (row-node[0]+ node[1])) < n){
                 list.add(col);
             }
            if( (col = (node[0] -row + node[1])) >0){
                list.add(col);
            }
        }
        return list;
    }


    private String genString(int n, int pos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == pos) {
                sb.append("Q");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }

}
