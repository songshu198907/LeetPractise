package algorithm.leet_121_135;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/12/16.
 */
public class SurroundedRegions_130 {
    private int rowLen = 0;
    private int colLen = 0;

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        List<Pos> start = new ArrayList<>();
        rowLen = board.length;
        colLen = board[0].length;
        for (int i = 0; i < rowLen; i++) {
            if (board[i][0] == 'O') {
                start.add(new Pos(i, 0));
                board[i][0] = 'Y';
            }
            if (board[i][colLen - 1] == 'O') {
                start.add(new Pos(i, colLen - 1));
                board[i][colLen - 1] = 'Y';
            }
        }
        for (int i = 0; i < colLen; i++) {
            if (board[0][i] == 'O') {
                start.add(new Pos(0, i));
                board[0][i] = 'Y';
            }
            if (board[rowLen - 1][i] == 'O') {
                start.add(new Pos(rowLen - 1, i));
                board[rowLen - 1][i] = 'Y';
            }
        }
        helper(start, board);
        replace(board);
        System.out.println("done !");

    }

    private void replace(char[][] board) {
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    private void helper(List<Pos> posList, char[][] board) {

        List<Pos> current = new ArrayList<>();
        for (Pos pos : posList) {
            int x = pos.x, y = pos.y;
            if (pos.x < 0 || pos.x > rowLen || pos.y < 0 || pos.y > colLen) {
                continue;
            }
            if (x + 1 < rowLen && board[x + 1][y] == 'O') {
                current.add(new Pos(x + 1, y));
                board[x + 1][y] = 'Y';
            }
            if (x - 1 > 0 && board[x - 1][y] == 'O') {
                current.add(new Pos(x - 1, y));
                board[x - 1][y] = 'Y';
            }
            if (y + 1 < colLen && board[x][y + 1] == 'O') {
                current.add(new Pos(x, y + 1));
                board[x][y + 1] = 'Y';
            }
            if (y - 1 > 0 && board[x][y - 1] == 'O') {
                current.add(new Pos(x, y - 1));
                board[x][y + 1] = 'Y';
            }
        }
        if (!current.isEmpty()) {
            helper(current, board);
        }
    }

    class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
