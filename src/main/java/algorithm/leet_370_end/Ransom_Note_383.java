package algorithm.leet_370_end;

/**
 * Created by songheng on 8/29/16.
 */
public class Ransom_Note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[256];
        char[] r_arr = ransomNote.toCharArray();
        char[] m_arr = magazine.toCharArray();
        for (char ch : m_arr) {
            arr[ch]++;
        }
        for (int i = 0; i < r_arr.length; i++) {
            if (arr[r_arr[i]]-- <= 0) return false;
        }
        return true;
    }
}
