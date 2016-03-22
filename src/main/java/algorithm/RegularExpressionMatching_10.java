package algorithm;

import java.util.Stack;

/**
 * Created by songheng on 3/17/16.
 */
public class RegularExpressionMatching_10 {
    public boolean isMatch(String s, String p) {
        boolean[] match  = new boolean[s.length()+1];
        for( int i = 0 ; i < s.length(); i++ ){
            match[i] = false;
        }
        match[s.length()] = true;
        for ( int n = p.length()-1 ; n>=0 ; n--){
            if (p.charAt(n) == '*'){
                for(int j = s.length()-1 ; j>=0; j--){
                    match[j] = match[j] || match[j+1]&&((p.charAt(n-1)==s.charAt(j))||p.charAt(n-1)=='.');
                }
                n--;
            }
            else{
                for ( int j = 0 ; j< s.length();j++){
                    match[j] = match[j+1] && (p.charAt(j)=='.'||p.charAt(j)==s.charAt(j));
                }
            }match[s.length()] = false;
        }

        return match[0];
    }
}
