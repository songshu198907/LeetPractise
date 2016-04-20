package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class NQueen51_2 {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            tmp.add("");
        }
        helper(result, tmp, n, n, arr,0);


        return result;

    }

    private void helper(List<List<String>> lists, List<String> prevPatt, int n, int remaining, int[][] arr,int row) {
        if (remaining == 0) {
            lists.add(prevPatt);
        }
        if(row >= n){
            return;
        }
        for (int i = row; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {

                    List<String> patt = new ArrayList<>(prevPatt);

                    patt.set(i,genString(n, j));
                    helper(lists, patt, n, remaining - 1, updateTable(arr, i, j, n),row+1);
                }
            }
        }
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

    private int[][] updateTable(int[][] origin, int x, int y, int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = origin[i][j] + checkCell(i, j, x, y);
            }
        }
        return arr;
    }

    private int checkCell(int x1, int y1, int x2, int y2) {
        if ((x2 - x1) == (y2 - y1)) {
            return 1;
        }

        if ((x2 - x1) == (y1 - y2)) {
            return 1;
        }
        if ((x1 == x2) || (y1 == y2)) {
            return 1;
        }
        return 0;
    }
}
