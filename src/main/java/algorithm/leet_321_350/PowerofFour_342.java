package algorithm.leet_321_350;

/**
 * Created by songheng on 8/19/16.
 */
public class PowerofFour_342 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) == num;
    }
}
