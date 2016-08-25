package algorithm.leet_351_365;

/**
 * Created by songheng on 8/25/16.
 */
public class Water_and_Jug_Problem_365 {
    public boolean canMeasureWater(int x, int y, int z) {
        return z == 0 || (x + y >= z && z % gcd(x, y) == 0);
    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
