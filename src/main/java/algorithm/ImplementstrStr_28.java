package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 3/22/16.
 */
public class ImplementstrStr_28 {
    public int strStr(String haystack, String needle) {
        char[] needles = needle.toCharArray();
        int head = -1;

        if (haystack == null
                ||
                haystack.length() < needle.length()
                ) {
            return head;
        }
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needles[0]) {
                head = i;
                int step = 1;
                while (step < needles.length && i + step < haystack.length()) {
                    if (haystack.charAt(i + step) != needles[step]) {
                        head = -1;
                        step = 1;
                        break;

                    } else {
                        step++;
                    }
                }
                if (step == needles.length) {
                    break;
                } else {
                    head = -1;
                    step = 1;

                }

            }
        }
        return head;
    }

    public int strStrBMP(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;

        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }
        int[] next = new int[needle.length()];
        next[0] = -1;
        int k = -1, j = 0;
        while (j < needle.length() - 1) {
            if (k == -1 || needle.charAt(k) == needle.charAt(j)) {
                ++k;
                ++j;
                next[j] = k;
                if (needle.charAt(k) != needle.charAt(j)) {
                    next[j] = k;
                } else {
                    next[j] = next[k];
                }
            } else {
                k = next[k];
            }
        }
        int i = 0;
        j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || needle.charAt(j) == haystack.charAt(i)) {
                i++;
                j++;
            } else {
                j = next[j];
            }

        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }

    }


    public int strStrSunny(String haystack, String needle) {
        int i = 0, j = 0;
        if (needle.length() == 0) {
            return 0;

        }
        Map<Character, Integer> map = new HashMap<>();
        for (int c = 0; c < needle.length(); c++) {
            map.put(needle.charAt(c), c);

        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }
        int length = needle.length();
        int start = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                ++i;
                ++j;
            } else {
                if (start + length >= haystack.length()) {
                    return -1;
                } else {
                    if (map.containsKey(haystack.charAt(start + length))) {
                        start += length - map.get(haystack.charAt(start + length));
                        i = start;
                        j = 0;
                    } else {
                        start = start + length + 1;
                        i = start;
                        j = 0;
                    }
                }
            }
        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }

    }


}
