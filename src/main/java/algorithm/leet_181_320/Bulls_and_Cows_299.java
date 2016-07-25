package algorithm.leet_181_320;

/**
 * Created by songheng on 7/13/16.
 */
public class Bulls_and_Cows_299 {
    public String getHint(String secret, String guess) {
        if (secret.isEmpty()) return "0A0B";
        int[] arr = new int[10];
        int[] gArr = new int[10];
        int a = 0;
        int b = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                a++;
            else {
                Integer val = guess.charAt(i) - '0';
                gArr[val]++;
                int gVal = secret.charAt(i) - '0';
                arr[gVal]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            b += Math.min(arr[i], gArr[i]);
        }
        return a + "A" + b + "B";

    }
}
