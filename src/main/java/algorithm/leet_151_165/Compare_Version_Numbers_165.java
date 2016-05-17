package algorithm.leet_151_165;

/**
 * Created by songheng on 5/17/16.
 */
public class Compare_Version_Numbers_165 {
    public int compareVersion(String version1, String version2) {
        int res = 0;
        int v1_start = 0, v1_end = 0, v2_start = 0, v2_end = 0;

        if (!version1.equals(version2)) {
            while (v1_start < version1.length() && v2_start < version2.length()) {
                v1_end = v1_start;
                v2_end = v2_start;
                for (; v1_end < version1.length(); v1_end++) {
                    if (version1.charAt(v1_end) == '.')
                        break;
                }

                for (; v2_end < version2.length(); v2_end++) {
                    if (version2.charAt(v2_end) == '.')
                        break;
                }

                String str1 = version1.substring(v1_start, v1_end);
                String str2 = version2.substring(v2_start, v2_end);
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                if (num1 > num2) {
                    return 1;
                } else if (num1 < num2)
                    return -1;
                v1_start = v1_end + 1;
                v2_start = v2_end + 1;
            }

            while (v1_start < version1.length() && (version1.charAt(v1_start) == '0' || version1.charAt(v1_start) == '.'))
                v1_start++;
            if (v1_start < version1.length())
                res = 1;
            while (v2_start < version2.length() && (version2.charAt(v2_start) == '0' || version2.charAt(v2_start) == '.'))
                v2_start++;
            if (v2_start < version2.length())
                res = -1;

        }
        return res;
    }
}
