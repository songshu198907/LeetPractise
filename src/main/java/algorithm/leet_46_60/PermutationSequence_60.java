package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class PermutationSequence_60  {
    public String getPermutation(int n, int k) {
        if( n == 1 ){
            return  "1";
        }
        List<Integer> digits = new ArrayList<>();
        for( int i = 1 ; i<=n ; i++){
            digits.add(i);
        }
        int[] support = new int[n - 1];
        StringBuilder sb = new StringBuilder();
        int tmp = n-3 ;
        support[n-2] = 1;
        if(n>=3){
            while ( tmp >= 0){
                support[tmp] = support[tmp+1] * ((n-1) - tmp);
                tmp --;
            }
        }
        k --;
        for(int i = 0 ; i < n-1 ; i ++ ){
            int offSet = k / support[i];
            k = k % support[i];
            int digit = digits.get(offSet);
            sb.append(digit);
            digits.remove(offSet);
        }
        sb.append(digits.get(0));
        System.out.println(Arrays.toString(support));
        return sb.toString();
    }
}
