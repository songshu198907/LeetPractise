package algorithm.leet_181_end;

/**
 * Created by shu on 5/26/2016.
 */
public class Kth_Largest_Element_in_an_Array_215 {
    public int findKthLargest(int[] nums, int k) {
        int res = 0;
        int zeros = 0 ;
        int[] pos = new int[20000];
        int[] neg = new int[20000];
        for (int num : nums) {
            if(num > 0 ){
                pos[num - 1]++;
            } else if(num == 0){
                zeros++;
            } else {
                neg[-1 - num] ++;
            }
        }
        int i = pos.length - 1;
        for (  ; i >= 0 ; i--){
            k -= pos[i];
            if(k<=0) return i+1;
        }
        k = k -zeros;
        if(k<=0) return 0;
        for(i=0 ; i < neg.length-1; i++){
            k-=neg[i];
            if(k<=0) return -1 - i;
        }


        return res;

    }
}
