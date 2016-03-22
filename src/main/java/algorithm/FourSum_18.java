package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/18/16.
 */
public class FourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        if (nums == null || nums.length < 4) {

        } else {
            for (int i = 0; i <= nums.length - 4; i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    for (int j = i + 1; j <= nums.length - 3; j++) {
                        int low = j + 1;
                        int high = nums.length - 1;
                        while (low < high) {


                            int sum = nums[i] + nums[j] + nums[low] + nums[high];
                            if (sum > target) {
                                high--;
                            } else if (sum == target) {
                                List<Integer> unit = new ArrayList<>();
                                unit.add(nums[i]);
                                unit.add(nums[j]);
                                unit.add(nums[low]);
                                unit.add(nums[high]);
                                low++;
                                high--;
                                Collections.sort(unit);
                                if (!result.contains(unit)) {
                                    result.add(unit);
                                }
                                while (low < high && nums[low] == nums[low - 1]) {
                                    low++;
                                }
                                while (low < high && nums[high] == nums[high + 1]) {
                                    high--;
                                }

                            }
                            else{
                                low ++;
                            }
                        }
                    }


                }
            }


        }
        return result;
    }


}
