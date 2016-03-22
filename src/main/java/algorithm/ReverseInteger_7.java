package algorithm;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by songheng on 3/14/16.
 */
public class ReverseInteger_7 {
    public int reverse(int x) {



        if(x>Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }

        int result = 0  ;
        boolean pos = true;
        if (x < 0) {
            pos = false;
            x = -x;
        }

        while(x>0){
            if(result > 0 && Integer.MAX_VALUE/result<10){
                return 0;
            }
            result = result*10 + x % 10;
            x /= 10;
        }
        if(!pos){
            result = -result;
        }




        return result;



    }
}
