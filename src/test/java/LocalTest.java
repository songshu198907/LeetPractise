import java.util.Arrays;

/**
 * Created by songheng on 3/18/16.
 */
public class LocalTest {
    public static void main(String[] args) {
        int[] a = {
               0, 1,2,3,4,5,6,7,8,9
        };
        int[] b = Arrays.copyOfRange(a,0,4);
        int[] c = Arrays.copyOfRange(a,5,a.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        int[] merged = new int[c.length +b.length];
        System.arraycopy(b,0,merged,0,b.length);
        System.arraycopy(c,0,merged,b.length,c.length);
        System.out.println(Arrays.toString(merged));

    }
}
