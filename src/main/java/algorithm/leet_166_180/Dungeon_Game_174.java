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
        blood[rowLen - 1][coLen - 1] = (1 - dungeon[rowLen - 1][coLen - 1]) > 1 ? 1 - dungeon[rowLen - 1][coLen - 1] : 1;
        for (int i = coLen - 2; i >= 0; i--) {
            int value = blood[rowLen - 1][i + 1] - dungeon[rowLen - 1][i];
            blood[rowLen - 1][i] = value < 1 ? 1 : value;
        }
        for (int i = rowLen - 2; i >= 0; i--) {
            int value = blood[i + 1][coLen - 1] - dungeon[i][coLen - 1];
            blood[i][coLen - 1] = value < 1 ? 1 : value;
        }
        for (int i = rowLen - 2; i >= 0; i--) {
            for (int j = coLen - 2; j >= 0; j--) {
                int value = Math.min(blood[i + 1][j], blood[i][j + 1]) - dungeon[i][j];
                blood[i][j] = value < 1 ? 1 : value;
            }
        }
        return blood[0][0];
    }
}
