package algorithm;

/**
 * Created by songheng on 3/17/16.
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0 ){
            return "";
        }
        String tmp = strs[0];
        int len = tmp.length();
        for(int i = 1 ; i < strs.length ; i++){
            int k = len < strs[i].length()? len:strs[i].length();
            int j ;
            for(  j = 0 ; j < k ; j++ ){
                if( tmp.charAt(j)!= strs[i].charAt(j)){

                    break;
                }


            }
            if(j<len){
                len = j ;
            }


        };
        return tmp.substring(0,len);
    }
}
