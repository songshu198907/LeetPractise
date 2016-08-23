package algorithm.leet_321_350;

/**
 * Created by songheng on 7/26/16.
 */
public class Verify_Preorder_Serialization_of_a_Binary_Tree_331 {
    public boolean isValidSerialization(String preorder) {
        if (preorder == null || preorder.length() == 0) return true;
        String tmp[] = preorder.split(",");
        int cnt = 0;

        for (int i = 0; i < tmp.length - 1; i++) {
            if (tmp[i].trim().equals("#")) {
                if (--cnt < 0) return false;

            } else cnt++;
        }


        return cnt != 0 && tmp[tmp.length - 1].equals("#");
    }
}
