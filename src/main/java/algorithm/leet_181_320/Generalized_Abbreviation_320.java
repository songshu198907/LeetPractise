package algorithm.leet_181_320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 7/24/2016.
 */
public class Generalized_Abbreviation_320 {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        dfs(res, "", 0, word);
        return res;
    }

    public void dfs(List<String> res, String curr, int start, String s) {
        res.add(curr + s.substring(start));
        if (start == s.length())
            return;
        int i = 0;

        // �����ʼ����ʼλ�ö�Ҫ��֮ǰ��βλ�ø�һ��
        if (start > 0) {
            i = start + 1;
        }

        for (; i < s.length(); i++) {
            String prefix = curr + s.substring(start, i);
            // ��ith�ַ���ͷ�������滻j����ĸ�����֡�
            for (int j = 1; j <= s.length() - i; j++) {
                dfs(res, prefix + j, i + j, s);
                //i+j,��ʾ����һ��start��ʼ�滻j����ĸ��ʼ����ĸλ�á�
            }
        }
    }

}
