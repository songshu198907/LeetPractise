package algorithm.leet_61_75;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/30/16.
 */
public class TextJustification_68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> row = new ArrayList<>();
        List<Integer> spaces = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int lenth = 0, space = 0;
        for (int i = 0; i < words.length; i++) {
            if (lenth + words[i].length() + space <= maxWidth) {
                lenth += words[i].length();
                row.add(words[i]);
                space++;
            } else {
                int remaining = maxWidth - lenth;
                space--;
                for (int tmp = 0; tmp < space; tmp++) {
                    spaces.add(0);
                }
                int start = 0;
                while (start < remaining) {
                    int index = start % space;
                    spaces.set(index, spaces.get(index) + 1);
                    start++;

                }
                System.out.println(spaces);


                for (int pos = 0; pos < row.size(); pos++) {
                    sb.append(row.get(pos));
                    if (pos < row.size() - 1) {
                        sb.append(genBlank(spaces.get(pos)));
                        remaining = remaining / space;
                        space--;
                    }

                }

                if (row.size() == 1) {

                    sb.append(genBlank(remaining));
                }
                res.add(sb.toString());
                sb = new StringBuilder();
                i--;
                row.clear();
                spaces.clear();
                space = 0;
                lenth = 0;
            }
        }
        if (!row.isEmpty()) {
            space--;
            for (int i = 0; i < row.size() - 1; i++) {
                sb.append(row.get(i)).append(" ");
            }
            sb.append(row.get(row.size() - 1));
            sb.append(genBlank(maxWidth - lenth - space));
            res.add(sb.toString());
        }

        return res;

    }

    private String genBlank(int x) {
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(" ");
            x--;
        }
        return sb.toString();
    }
}
