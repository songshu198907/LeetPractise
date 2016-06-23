package algorithm.leet_181_end;

/**
 * Created by shu on 6/22/2016.
 */
public class IntegertoEnglishWords_273 {
    private final String[] units = {
            "Trillion", "Billion", "Million", "Thousand", ""
    };
    private final String[] number = {
            "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine"
    };
    private final String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private final String[] tens = {
            "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        String str = "";
        int cnt = 4;
        while (num > 0) {
            int dig = num % 1000;
            str = buildHundred(dig) + units[cnt] + " " + str;
            num /= 1000;
            cnt--;
        }
        return str.trim();

    }

    private String buildHundred(int num) {
        StringBuilder sb = new StringBuilder();
        int h = num / 100;
        if (h > 0) {
            sb.append(number[h - 1]).append(" Hundred ");
        }
        num = num % 100;
        h = num / 10;

        if (h == 1) {
            h = num % 10;
            sb.append(teens[h]).append(" ");
        } else {
            if (h > 1) {
                sb.append(tens[h - 2]).append(" ");
                num = num % 10;
                if (num > 0) {
                    sb.append(number[num - 1]).append(" ");
                }
            } else {
                h = num % 10;
                if (h > 0) {
                    sb.append(number[h - 1]).append(" ");
                }
            }


        }

        return sb.toString();
    }
}
