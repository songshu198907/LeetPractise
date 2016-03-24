package algorithm.leet_31_45;

/**
 * Created by songheng on 3/24/16.
 */
public class ValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {

        if (board == null || board.length != 9 || board[0].length != 9)
            return false;
        for (int i = 0; i < 9; i++) {
            boolean[] map = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (map[board[i][j] - '1']) {
                        return false;
                    }
                    map[board[i][j] - '1'] = true;
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            boolean[] map = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (map[board[i][j] - '1']) {
                        return false;
                    }
                    map[board[i][j] - '1'] = true;
                }
            }
        }
        for (int block = 0; block < 9; block++) {
            boolean[] map = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if (map[board[i][j] - '1']) {
                            return false;
                        }
                        map[board[i][j] - '1'] = true;
                    }
                }
            }
        }
        return true;
    }
}
