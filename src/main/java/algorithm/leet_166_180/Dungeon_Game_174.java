package algorithm.leet_166_180;

/**
 * Created by songheng on 5/18/16.
 */
public class Dungeon_Game_174 {

    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null) {
            return 0;
        }
        int rowLen = dungeon.length;
        if (rowLen == 0) {
            return 1;
        }
        int coLen = dungeon[0].length;
        int[][] blood = new int[rowLen][coLen];
        blood[0][0] = dungeon[0][0] > 0 ? 1 : dungeon[0][0];

        for (int i = 1; i < coLen; i++) {
            if (dungeon[0][i] >= 0) {

                blood[0][i] = blood[0][i - 1] >= 0 ? blood[0][i - 1] + dungeon[0][i] : blood[0][i - 1];
            } else {
                blood[0][i] = blood[0][i - 1] + dungeon[0][i];
            }

        }
        for (int i = 1; i < rowLen; i++) {
            if (dungeon[i][0] >= 0) {
                blood[i][0] = blood[i - 1][0] >= 0 ? blood[i - 1][0] + dungeon[i][0] : blood[i - 1][0];
            } else {
                blood[i][0] = blood[i - 1][0] + dungeon[i][0];
            }
        }
        for (int i = 1; i < rowLen; i++)
            for (int j = 1; j < coLen; j++) {
//                if (dungeon[i][j] >= 0) {
//                    blood[i][j] = Math.max(blood[i - 1][j], blood[i][j - 1]);
//                } else
//
//                    blood[i][j] = Math.max(blood[i - 1][j], blood[i][j - 1]) + dungeon[i][j];
                int max = Math.max(blood[i - 1][j], blood[i][j - 1]);
                if (max >= 0) {
                    if (blood[i - 1][j] == max) {
                        blood[i][j] = blood[i - 1][j] + dungeon[i][j];
                    } else {
                        blood[i][j] = blood[i][j - 1] + dungeon[i][j];
                    }
                } else {
                    if (dungeon[i][j] >= 0) {
                        blood[i][j] = Math.max(blood[i][j - 1], blood[i - 1][j]);
                    } else {
                        blood[i][j] = Math.max(blood[i][j - 1], blood[i - 1][j]) + dungeon[i][j];
                    }
                }
            }
        if (blood[rowLen - 1][coLen - 1] > 0) {
            return 1;
        } else {
            return 1 - blood[rowLen - 1][coLen - 1];
        }
    }
}
