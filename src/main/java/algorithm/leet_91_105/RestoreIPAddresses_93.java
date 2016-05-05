package algorithm.leet_91_105;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/5/16.
 */
public class RestoreIPAddresses_93 {

    public List<String> restoreIpAddresses(String s) {

        List<String> res = new ArrayList<>();
        if (s.length() > 12) {
            return res;
        }
        buildList(res, "", s, 4);
        return res;
    }

    private void buildList(List<String> res, String prev, String s, int remaining) {
        if (remaining == 0) {
            res.add(prev.substring(0, prev.lastIndexOf(".")));
            return;
        } else {
            int minNum = s.length() - (remaining - 1) * 3 - 1;
            for (int i = minNum <= 0 ? 0 : minNum; i <= s.length() - remaining; i++) {
                int value = Integer.parseInt(s.substring(0, i + 1));
                if (value <= 255) {
                    if (i + 1 > 1 && s.charAt(0) == '0') {
                        return;
                    }
                    buildList(res, prev + s.substring(0, i + 1) + ".", s.substring(i + 1), remaining - 1);
                } else {
                    return;
                }

            }
        }
    }
}
