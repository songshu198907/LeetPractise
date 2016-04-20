package algorithm.leet_76_90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 4/18/16.
 */
public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
        List<List<String>> words = new ArrayList<>();

        int rowLen = board.length;
        int colLen = board[0].length;
        char start = word.charAt(0);
        int[] head = findStart(0, 0, board, start);
        while (head[0] >= 0 && head[1] >= 0) {
            int[][] support = new int[rowLen][colLen];
            support[head[0]][head[1]] = 1;
            if (search(head ,board, word, 0, support)) {
                return true;
            }
            head = findStart(head[0],head[1]+1,board,start);
        }


        return false;
    }

    private boolean search(int[] start ,char[][] board, String word, int len, int[][] support) {
        if(len == word.length()){
            return true;
        }
        int row = start[0];
        int col = start[1];
        for( int i = 0; i < word.length(); i++){

        }
        return  true;
    }

    private int[] findStart(int row, int col, char[][] board, char target) {
        for (int cl = col; cl < board[0].length; cl++) {
            if (board[row][cl] == target) {
                return new int[]{
                        row, cl
                };
            }
        }
        for (int i = row + 1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == target) {
                    return new int[]{
                            i, j
                    };
                }
            }
        }
        return new int[]{-1, -1};
    }


}
