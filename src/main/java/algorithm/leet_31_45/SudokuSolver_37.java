package algorithm.leet_31_45;

/**
 * Created by songheng on 3/24/16.
 */
public class SudokuSolver_37 {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9)
            return;
        helper(board, 0, 0);


    }

    private boolean helper(char[][] board, int row, int col) {
        if (col >= 9) {
            return helper(board, row + 1, 0);
        } else {
            if (row >= 9) {
                return true;
            }
        }
        if (board[row][col] == '.') {
            for (int i = 1; i <= 9; i++) {
                board[row][col] = (char) ('0' + i);
                if (isValidSudoku(board)) {
                    if (helper(board, row, col + 1)) {
                        return true;
                    }
                }

                board[row][col] = '.';

            }

        } else {
            return helper(board, row, col + 1);
        }

        return false;
    }


    private boolean isValidSudoku(char[][] board) {

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
