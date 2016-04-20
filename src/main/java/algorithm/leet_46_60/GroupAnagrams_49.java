package algorithm.leet_46_60;

import java.util.*;

/**
 * Created by songheng on 3/28/16.
 */
public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
             char[] chars = str.toCharArray();

            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            if (map.containsKey(key)) {

                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }

        }
        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
            result.add(map.get(key));
        }
        return result;
    }

}
