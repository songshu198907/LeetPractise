import algorithm.leet_61_75.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by songheng on 3/30/16.
 */
public class CodeTest_61_75 {
    @Test
    public void test61() {
        RotateList_61 rotate = new RotateList_61();
        rotate.rotateRight(ListNode.buildList(new int[]{1}), 1).print();
        rotate.rotateRight(ListNode.buildList(new int[]{1, 2, 3, 4, 5}), 8).print();
        rotate.rotateRight(ListNode.buildList(new int[]{1, 2}), 2).print();
        rotate.rotateRight(ListNode.buildList(new int[]{1, 2}), 0).print();
    }

    @Test
    public void test62() {
        UniquePaths_62 path = new UniquePaths_62();
        System.out.println(path.uniquePaths(23, 12));
    }

    @Test
    public void test63() {
        UniquePathsII_63 path = new UniquePathsII_63();
        System.out.println(path.uniquePathsWithObstacles(new int[][]{
                {1}, {0}
        }));
    }

    @Test
    public void test64() {
        MinimumPathSum_64 path = new MinimumPathSum_64();
        System.out.println(path.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    @Test
    public void test65() {
        ValidNumber_65 valid = new ValidNumber_65();
//        System.out.println(valid.isNumber("0"));
//        System.out.println(valid.isNumber(" 0.1 "));
//        System.out.println(valid.isNumber("abc"));
//        System.out.println(valid.isNumber("1 a"));
//        System.out.println(valid.isNumber("2e10"));
//        System.out.println(valid.isNumber("44e016912630333"));
//        System.out.println("========================");
//        System.out.println(valid.isNumber2("0"));
//        System.out.println(valid.isNumber2(" 0.1 "));
//        System.out.println(valid.isNumber2("abc"));
//        System.out.println(valid.isNumber2("1 a"));
//        System.out.println(valid.isNumber2("2e10"));
//        System.out.println(valid.isNumber2("44e016912630333"));
//        System.out.println(valid.isNumber2("-1."));
        System.out.println(valid.isNumber("-1e+2"));
//        System.out.println(valid.isNumber2("-.."));

    }

    @Test
    public void test67() {
        AddBinary_67 binary = new AddBinary_67();
//        binary.addBinary("11","1");
        System.out.println(binary.addBinary("1１", "001"));
    }

    @Test
    public void test68() {
        TextJustification_68 text = new TextJustification_68();
//        List list = text.fullJustify(new String[]{"Don't","go","around","saying","the","world","owes","you","a","living;","the","world","owes","you","nothing;","it","was","here","first."},30);
//        System.out.println(list);
        List list = text.fullJustify(new String[]{"a", "b", "c", "d", "e"}, 3);
        System.out.println(list);
//        System.out.println(text.fullJustify(new String[]{"Listen","to","many,","speak","to","a","few."},6));
//        System.out.println(text.fullJustify(new String[]{""}, 2));

    }

    @Test
    public void test69() {
        SqrtX_69 sqrt = new SqrtX_69();
        System.out.println(sqrt.test2(1000021));
    }

    @Test
    public void test71() {
        SimplifyPath_71 simplify = new SimplifyPath_71();
        System.out.println(simplify.simplifyPath("/home/"));
        System.out.println(simplify.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void test72() {
        EditDistance_72 distance = new EditDistance_72();
        System.out.println(distance.minDistance("a", "a"));
    }

    @Test
    public void test74() {
        Search_a_2D_Matrix_74 search = new Search_a_2D_Matrix_74();
        int[][] matrix = new int[][]{
                {
                        1, 3, 5, 7
                }, {
                10, 11, 16, 20
        }, {
                23, 30, 34, 50
        }
        };
        System.out.println( search.searchMatrix(matrix,31));
    }
    @Test
    public void test75(){
        SortColors_75 sort = new SortColors_75();
        int[] arr = new int[]{1,0,0};
        sort.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}