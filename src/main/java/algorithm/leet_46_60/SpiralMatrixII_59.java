package algorithm.leet_46_60;

/**
 * Created by songheng on 3/29/16.
 */
public class SpiralMatrixII_59 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int[][] support = new int[n][n];

        int direction = 4, option = 0;
        int row = 0, col = 0, number = 1;
        while (number <= n * n) {
            if (option == 0) {
                while (col < n && support[row][col] == 0) {
                    support[row][col] = 1;
                    arr[row][col] = number;
                    col++;
                    number++;

                }
                col--;
                row++;
                option = (option + 1) % direction;

            } else if (option == 1) {
                while (row < n && support[row][col] == 0) {
                    support[row][col] = 1;
                    arr[row][col] = number;
                    row++;
                    number++;
                }
                row--;
                col--;
                option = (option + 1) % direction;
            } else if (option == 2) {
                while (col >= 0 && support[row][col] == 0) {
                    support[row][col] = 1;
                    arr[row][col] = number;
                    col--;
                    number++;
                }
                col++;
                row--;
                option = (option + 1) % direction;
            } else {
                while (row >= 0 && support[row][col] == 0) {
                    support[row][col] = 1;
                    arr[row][col] = number;
                    row--;
                    number++;
                }
                row++;
                col++;
                option = (option + 1) % direction;
            }
        }
        return arr;
    }

}
