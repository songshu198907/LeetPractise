package algorithm.leet_76_90;

import org.apache.commons.collections.map.HashedMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 5/4/16.
 */
public class ScrambleString_87 {
    public boolean isScramble(String s1, String s2) {
            if(s1.length() != s2.length()){
                return false;
            }
            if(s1.equals(s2)){
                return true;
            }
        return checkArr(s1,s2);
    }
    private boolean checkArr(String s1 ,String s2){
        if(s1.equals(s2)){
            return true;
        }
        boolean res = false;
        int start = 0 , end = s1.length() -1 ;
        int[][] assist = new int[3][128];
        while(start < s1.length() && end >= 0 ){
            assist[0][s1.charAt(start)]++;
            assist[1][s2.charAt(start)]++;
            assist[2][s2.charAt(end)]++;
            if (Arrays.equals(assist[0], assist[1])) {
                if(start + 1 == s1.length()){
                    return res;
                }
                res = res || checkArr(s1.substring(0,start+1),s2.substring(0,start+1))&&
                        checkArr(s1.substring(start+1),s2.substring(start+1));


            } else if(Arrays.equals(assist[0],assist[2] )){
                res = res || checkArr(s1.substring(0,start+1),s2.substring(end)) && checkArr(s1.substring(start+1),s2.substring(0,end));
            }
            start++;
            end -- ;
        }

        return res;
    }

}
