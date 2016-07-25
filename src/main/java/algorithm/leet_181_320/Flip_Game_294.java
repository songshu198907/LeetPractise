package algorithm.leet_181_320;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by songheng on 7/12/16.
 */
public class Flip_Game_294 {
    private int mex(Set<Integer> set) {
        int m = set.size();
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(i)) return i;
        }
        return m;
    }

    public boolean canWin(String s) {
        TreeSet<Integer> set = new TreeSet<>();
        int max = 0;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') len++;
            if (i + 1 == s.length() || s.charAt(i) != '+') {
                if (len >= 2) set.add(len);
                max = Math.max(len, max);
                len = 0;

            }
        }
        int[] g = new int[max + 1];
        for (int l = 2; l <= max; l++) {
            Set<Integer> suc = new HashSet<>();
            for (int j = 0; j < l / 2; j++) {
                int lSec = l - j - 2;
                suc.add(g[lSec] ^ g[l]);
            }
            g[l] = mex(suc);
        }
        int g_final = 0;
        for (int i : set) {
            g_final ^= g[i];
        }
        return g_final != 0;
    }
}
