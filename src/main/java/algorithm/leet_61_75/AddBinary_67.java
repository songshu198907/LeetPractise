package algorithm.leet_61_75;

/**
 * Created by songheng on 3/30/16.
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int aStart = 0, bStart = 0;
        while (aStart < a.length()) {
            if (a.charAt(aStart) != '0') {
                break;
            }
            aStart++;
        }
        while (bStart < b.length()) {
            if (b.charAt(bStart) != '0') {
                break;
            }
            bStart++;
        }
        if (aStart == a.length() && bStart == b.length()) {
            res.append(0);
        } else if (aStart == a.length()) {
            res.append(b.substring(bStart));
        } else if (bStart == b.length()) {
            res.append(a.substring(aStart));

        } else {
            boolean add = false;
            int aPos = a.length() - 1;
            int bPos = b.length() - 1;
            int sum;
            while (aPos >= aStart && bPos >= bStart) {

                sum = a.charAt(aPos--) - '0' + b.charAt(bPos--) - '0';
                if (add) {
                    sum++;
                }
                if (sum >= 2) {
                    sum = sum % 2;
                    add = true;
                } else {
                    add = false;
                }
                res.insert(0, sum);

            }
            while (aPos >= aStart) {
                sum = a.charAt(aPos--) - '0';
                if (add) {
                    sum++;
                }
                if (sum >= 2) {
                    sum = sum % 2;
                    add = true;
                } else {
                    add = false;
                }
                res.insert(0, sum);
                ;
            }
            while (bPos >= bStart) {
                sum = b.charAt(bPos--) - '0';
                if (add) {
                    sum++;
                }
                if (sum >= 2) {
                    sum = sum % 2;
                    add = true;
                } else {
                    add = false;
                }
                res.insert(0, sum);

            }
            if (add) {
                res.insert(0, 1);

            }
        }

        return res.toString();

    }

    ;
}
