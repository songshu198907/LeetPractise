package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 7/12/16.
 */
public class Flip_Game_293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String str = s.substring(i, i + 2);
            if (str.equalsIgnoreCase("++")) {
                char[] chs = s.toCharArray();
                chs[i] = '-';
                chs[i + 1] = '-';
                list.add(new String(chs));
            }

        }
        return list;
    }
}
