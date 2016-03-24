package algorithm.leet_31_45;

/**
 * Created by songheng on 3/24/16.
 */
public class SearchforaRange_34 {
    public int[] searchRange(int[] nums, int target) {

        int start = -1, end = -1;
        int[] tmp = erfenfa(nums, target, 0, nums.length - 1);
        if (tmp != null) {
            start = tmp[0];
            end = tmp[1];
        }
        return new int[]{
                start, end
        };
    }

    private int[] erfenfa(int[] nums, int target, int left, int right) {
        int[] res = new int[]{-1, -1};

        if (left < right) {
            if (nums[right] >= target && nums[left] <= target) {
                if (nums[left] == target && nums[right] == target) {
                    return new int[]{
                            left, right
                    };
                } else {
                    int center = (left + right) / 2;

                    int[] leftRes = erfenfa(nums, target, left, center);

                    int[] rightRes = erfenfa(nums, target, center + 1, right);
                    if (rightRes[0] >= 0 && leftRes[0] >= 0) {
                        res[0] = leftRes[0];
                        res[1] = rightRes[1];
                    } else if (rightRes[0] >= 0) {
                        res = rightRes;
                    } else if (leftRes[0] >= 0) {
                        res = leftRes;
                    }


                    return res;
                }


            } else {
                return res;
            }
        } else {
            if (nums[left] == target) {
                return new int[]{
                        left, left
                };
            } else {
                return res;
            }
        }
    }

}
