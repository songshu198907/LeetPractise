package algorithm.leet_181_end;

/**
 * Created by songheng on 7/12/16.
 */
public class Find_the_Duplicate_Number_287 {
    public int findDuplicate(int[] nums) {
        int left = 1, right = nums.length;
        while (left < right) {
            int cnt = 0;
            int mid = (left + right) / 2;
            for (int num : nums) {
                if (num <= mid) cnt++;
            }
            if (cnt > mid) right = mid;
            else if (cnt <= mid) left = mid + 1;
        }
        return left;
    }

    public int findDuplicate2(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int find = 0;
        while (find != slow) {
            find = nums[find];
            slow = nums[slow];
        }
        return find;

    }
}
