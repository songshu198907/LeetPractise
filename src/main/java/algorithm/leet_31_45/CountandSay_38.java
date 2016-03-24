package algorithm.leet_31_45;

/**
 * Created by songheng on 3/24/16.
 */
public class CountandSay_38 {
    public String countAndSay(int n) {

        if (n == 0) {
            return "1";
        }
        if (n < 0) {
            return null;
        }
        String preset = "1";
        for (int i = 1; i < n; i++) {

            preset = build(preset);
            System.out.println(i + ":" + preset);
        }
        return preset;

    }

    private final String build(String last) {
        StringBuilder sb = new StringBuilder();
        char current = last.charAt(0);
        int length = 1;
        int pos = 1;
        while (pos < last.length()) {
            if (last.charAt(pos) == current) {
                length++;

            } else {
                sb.append(length).append(current);
                current = last.charAt(pos);
                length = 1;
            }
            pos++;

        }
        sb.append(length).append(current);
        return sb.toString();


    }
}
