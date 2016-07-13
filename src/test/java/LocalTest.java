


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by songheng on 3/18/16.
 */
public class LocalTest {
    public static void main(String[] args) {
        String str = " ( 2+32 -( 322 + 12) +21 )";
        System.out.println(getTokens(str));
        Hashtable<Integer, Integer> table = new Hashtable<>();

    }

    private static List<String> getTokens(String str) {
        List<String> tokens = new ArrayList<>();
        int pos = 0;
        while (pos < str.length()) {
            for (int i = pos; i < str.length(); i++) {
                if (str.charAt(i) == '+'
                        || str.charAt(i) == '-'
                        || str.charAt(i) == '*'
                        || str.charAt(i) == '/'
                        || str.charAt(i) == '('
                        || str.charAt(i) == ')'
                        ) {
                    if (i == pos) {
                        pos++;
                        tokens.add(str.substring(i, pos));
                        break;
                    } else {
                        String tmp = str.substring(pos, i).trim();
                        if (!tmp.trim().isEmpty()) {

                            tokens.add(str.substring(pos, i).trim());
                        }
                        pos = i;
                        break;
                    }

                }
            }
        }
        return tokens;

    }
}
