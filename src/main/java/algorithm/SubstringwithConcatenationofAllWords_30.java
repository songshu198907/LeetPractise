package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by songheng on 3/23/16.
 */
public class SubstringwithConcatenationofAllWords_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        String S = s;
        String[] L = words;
        // Start typing your Java solution below
        // DO NOT write main() function
        if (L == null || L.length == 0) return null;
        int n = L.length, m = L[0].length(), l = S.length();
        ArrayList<Integer> res = new ArrayList<Integer>();

        Map<String, Integer> covered = new HashMap<String, Integer>();
        for (int j = 0; j < n; j++) {
            if (covered.containsKey(L[j])) {
                covered.put(L[j], covered.get(L[j]) + 1);
            } else {
                covered.put(L[j], 1);
            }
        }

        int i = 0;
        while (l - i >= n * m) {
            Map<String, Integer> temp = new HashMap<String, Integer>(covered);
            for (int j = 0; j < n; j++) {
                String testStr = S.substring(i + j * m, i + (j + 1) * m);
                if (temp.containsKey(testStr)) {
                    if (temp.get(testStr) - 1 == 0)
                        temp.remove(testStr);
                    else
                        temp.put(testStr, temp.get(testStr) - 1);
                } else
                    break;
            }
            if (temp.size() == 0) res.add(i);
            i++;
        }
        return res;
    }
}
