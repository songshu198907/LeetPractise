package algorithm.leet_181_320;

/**
 * Created by songheng on 7/12/16.
 */
public class Game_of_Life_289 {
    public void gameOfLife(int[][] board) {
        int rowLen = board.length;
        int coLen = board[0].length;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < coLen; j++) {
                int live = 0;
                if (i + 1 < rowLen) {
                    if (board[i + 1][j] == 1 || board[i + 1][j] == -1)
                        live++;
                    if (j - 1 >= 0) {
                        if (board[i + 1][j - 1] == 1 || board[i + 1][j + 1] == -1)
                            live++;
                    }
                    if (j + 1 < coLen) {
                        if (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == -1)
                            live++;
                    }
                }
                if (i - 1 >= 0) {
                    if (board[i - 1][j] == 1 || board[i - 1][j] == -1)
                        live++;
                    if (j - 1 >= 0) {
                        if (board[i - 1][j - 1] == 1 || board[i - 1][j + 1] == -1)
                            live++;
                    }
                    if (j + 1 < coLen) {
                        if (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == -1)
                            live++;
                    }
                }
                if (j - 1 >= 0)
                    if (board[i][j - 1] == 1 || board[i][j - 1] == -1)
                        live++;
                if (j + 1 < coLen)
                    if (board[i][j + 1] == 1 || board[i][j + 1] == -1)
                        live++;
                int val = board[i][j];
                if (val == 0) {
                    if (live == 3) {
                        board[i][j] = 2;
                    }

                } else {
                    if (live == 2 || live == 3) {
                        continue;
                    } else board[i][j] = -1;

                }

            }
        }
        for (int i = 0; i < rowLen; i++)
            for (int j = 0; j < coLen; j++)
                if (board[i][j] > 0) board[i][j] = 1;
                else board[i][j] = 0;

    }


}
