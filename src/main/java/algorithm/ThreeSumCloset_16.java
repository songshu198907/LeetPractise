package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/17/16.
 */
public class ThreeSumCloset_16 {

    public int threeSumClosest(int[] nums, int target) {
        int res = 0 ;
        Arrays.sort(nums);
        int nearest = nums[nums.length -1 ] * 3 - nums[0]*3 ;

        if (nums == null || nums.length < 3 ){
            return res;
        }


        for(int i = 0 ; i <= nums.length -3 ; i++){


            int low = i+1;
            int high = nums.length - 1;
            int sum = nums[i]+nums[low]+nums[high];
            if(sum>target){
                while(low<high){
                    sum = nums[i]+nums[low]+nums[high];
                    if(sum > target ){
                        high --;
                        int diff = sum - target;
                        if(diff < nearest ){
                            nearest = diff;
                            res = sum;
                        }
                    }
                    else if (sum == target) {
                         nearest = 0 ;
                         res = target;
                        i = nums.length+1;
                        break;
                    }
                    else{
                        int diff = target -sum;
                        if ( diff <nearest){
                            res = sum;
                            nearest = diff;
                            break;
                        }

                    }



                }
            }
            else if (sum == target ){
                res = target;
                break;


            }
            else  {
                while(low<high){
                    sum = nums[i]+nums[low]+nums[high];
                    if(sum < target ){
                        low ++;
                        int diff = target - sum;
                        if(diff < nearest ){
                            nearest = diff;
                            res = sum;
                        }
                    }
                    else if (sum == target) {
                        nearest = 0 ;
                        res = target;
                        i = nums.length+1;
                        break;
                    }
                    else{
                        int diff = sum - target;
                        if ( diff <nearest){
                            res = sum;
                            nearest = diff;
                            break;
                        }

                    }



                }
            }
        }
        return res;
    }
    public int threeSumClosestFaster(int[] nums, int target) {
        int result = 0 ;
        int distance = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0 ; i <= nums.length-3 ; i++  ){
            int high = nums.length -1;
            int low = i + 1;
            boolean up = false;
            boolean down = false;
            int sum = nums[i] + nums[low] + nums[high];
            if (sum > target ) up = true;
            if (sum < target ) down = true;
            while(low < high){
                 sum = nums[i] + nums[low] + nums[high];
                System.out.println("sum is " + sum + " === > "+nums[i]+":"+nums[low]+":"+nums[high]);
                if( sum  == target ){
                    result = target;
                    i  = nums.length+1;
                    break;
                }
                else if (sum < target){
                    int tmp  = target -sum ;
                    if ( tmp < distance){
                        distance = tmp;
                        result = sum ;
                    }

                    low++;
                }
                else{
                    int tmp = sum -target;
                    if ( tmp <distance){
                        distance = tmp;
                        result = sum;
                    }

                    high -- ;
                }
            }





        }

        return  result;



    }
}
