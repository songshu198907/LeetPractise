package algorithm;

/**
 * Created by songheng on 3/14/16.
 */
public class Palindrome {
    public String longestPalindrome(String s) {
        if(s == null){
            return  null;
        }
        String longest = s.substring(0,1);

        for(int i =0 ; i <s.length()-1;i++){
            String palindrome = subProgram(s,i,i);
            if(palindrome.length() > longest.length()){
                longest = palindrome;
            }
            palindrome = subProgram(s,i,i+1);
            if(palindrome.length()>longest.length()){
                longest = palindrome;
            }
        }

        return longest;
    }

    private String subProgram(String str  , int left, int right){
        if (left>right ){
            return null;

        }
        while(left>=0 && right < str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().longestPalindrome("aaaabbbbbbbb"));
    }
}
