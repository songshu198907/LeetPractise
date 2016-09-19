package algorithm.leet_166_180;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 9/19/16.
 */
public class Two_Sum_II_167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num) + 1, i + 1};
            } else {
                map.put(target - num, i);
            }
        }
        return null;
    }
}
