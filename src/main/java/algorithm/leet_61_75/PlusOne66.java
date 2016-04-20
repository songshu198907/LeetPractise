package algorithm.leet_61_75;

/**
 * Created by songheng on 3/30/16.
 */
public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        boolean add = false;
        int[] tmp = new int[digits.length+1];
        for(int pos = digits.length - 1  ; pos >= 0 ; pos++){
            if(add){
                int sum = digits[pos] + 1 ;
                if(sum == 10 ){
                    digits[pos] = 0 ;
                } else {
                    digits[pos]  = sum;
                    add = false;
                }
            } else {
                if(pos < digits.length - 1 ){
                    break;
                } else {
                    int sum = digits[pos] + 1 ;
                    if(sum == 10 ){
                        digits[pos] = 0 ;
                        add = true;
                    } else {
                        digits[pos]  = sum;

                    }
                }
            }
        }
        if(add){
            tmp[0] = 1;
            for(int i = 0; i < digits.length ; i++){
                tmp[i+1] = digits[i];
            }
            digits = tmp;
        }
        return digits;
    }
}
