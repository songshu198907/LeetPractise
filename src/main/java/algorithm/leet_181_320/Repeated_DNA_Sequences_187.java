package algorithm.leet_181_320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/19/16.
 */
public class Repeated_DNA_Sequences_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> tmp = new ArrayList<>();
        List<String> res = new ArrayList<>();
        if (s.length() <= 10) {
            return res;
        }
        for (int i = 0; i < s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            if (tmp.contains(str)) {
                if (res.contains(str))
                    continue;
                else res.add(str);
            } else
                tmp.add(str);
        }
        return res;
    }

    public List<String> findRepeatedDnaSequences2(String s) {
        List<String> tmp = new ArrayList<>();
        List<String> res = new ArrayList<>();
        if (s.length() <= 10) {
            return res;
        }
        boolean[] hashMap = new boolean[1024 * 1024];
        int[] covert = new int[26];
        covert[0] = 0;
        covert[2] = 1;
        covert[6] = 2;
        covert[19] = 3;
        int hash = 0;
        for (int i = 0; i < 10; i++) {
            hash <<= 2;
            hash |= covert[s.charAt(i) - 'A'];
        }
        hashMap[hash] = true;
        for (int i = 10; i < s.length(); i++) {
            hash <<= 2;
            hash |= covert[s.charAt(i) - 'A'];
            hash &= ~(0x300000);
            if (hashMap[hash]) {
                String str = s.substring(i - 9, i + 1);
                if (!res.contains(str))
                    res.add(str);
            } else
                hashMap[hash] = true;
        }

        return res;
    }
}
