package algorithm.leet_91_105;

/**
 * Created by shu on 5/5/2016.
 */
public class InterleavingString_97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        boolean[][] arr = new boolean[s1.length() +1][s2.length()+1];
        arr[0][0] = true;
        for (int i = 1; i <= s1.length() ; i++) {
            arr[i][0] = s1.charAt(i-1)==s3.charAt(i-1) && arr[i-1][0];
        }
        for (int i = 1; i <= s2.length(); i++) {
            arr[0][i] |= s2.charAt(i-1)==s3.charAt(i-1)&& arr[0][i-1];
        }
        for(int i = 1; i <= s1.length() ; i++)
            for (int j = 1; j <= s2.length(); j++) {
                arr[i][j] = (s1.charAt(i-1)==s3.charAt(i+j-1)&&arr[i-1][j] ) ||(s2.charAt(j-1) == s3.charAt(i+j-1) && arr[i][j-1]);
            }

        return arr[s1.length()][s2.length()];
    }
}
