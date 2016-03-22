package algorithm;

import java.math.BigDecimal;

/**
 * Created by songheng on 3/15/16.
 */
public class StringToInterger_8 {
    public int myAtoi(String str) {

         if(str.length() == 0 ){
             return 0;
         }


        str = str.trim();
        for ( int i = 0 ; i < str.length() ; i++){
            int code = str.charAt(i);
            if((code<48 || code > 57) && (code != 45) && (code != 43)){
                str = str.substring(0,i);
                break;
            }
        }
        Double tmp = -1.0 ;
        int result  ;
        try{
            tmp = Double.parseDouble(str);
        }
        catch ( Exception e){
            tmp = 0.0;
        }finally {
            if(tmp >Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
            } else  if (tmp < Integer.MIN_VALUE) {
                result = Integer.MIN_VALUE;
            }
            else{
                result = tmp.intValue();
            }
            return result;
        }



    }
}
