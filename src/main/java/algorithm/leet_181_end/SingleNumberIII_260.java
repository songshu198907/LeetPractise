package algorithm.leet_181_end;

/**
 * Created by shu on 6/22/2016.
 */
public class SingleNumberIII_260 {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        int counter = 0;
        while ((res & 0X1) != 1) {
            res >>= 1;
            counter++;
        }
        int a = 0;
        int b = 0;

        for (int num : nums) {
            int tmp = num >> counter;
            if ((tmp & 0X1) == 1) a = a ^ num;
            else b = b ^ num;
        }
        return new int[]{a, b};

    }
}
