import algorithm.ListNode;
import algorithm.NodeListBuilder;
import algorithm.leet_76_90.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by songheng on 4/18/16.
 */
public class codeTest_76_90 {
    @Test
    public void test76(){
        Minimum_Window_Substring_76 min = new Minimum_Window_Substring_76();
        System.out.println(min.minWindow("ab","b"));
        System.out.println(min.minWindow("bba","ab"));
    }
    @Test
    public void test77(){
        Combinations_77 comb = new Combinations_77();
        comb.combine(4,2).stream().forEach(System.out::println);
        comb.combine(1,1).stream().forEach(System.out::println);
    }
    @Test
    public void test78(){
        Subsets_78 subset = new Subsets_78();
        subset.subsets(new int[]{0}).stream().forEach(System.out::println);
        subset.subsets(new int[]{1,2,3}).stream().forEach(System.out::println);
    }

    @Test
    public void test79() {
        WordSearch_79 word = new WordSearch_79();
        String[] arr;
        arr = new String[]{
                "ABCE", "SFCS", "ADEE"
        };
        boolean res;
//        res = word.exist(stringArrtoCharArr(arr),"ABCCED");
//        System.out.println(res);
//        res = word.exist(stringArrtoCharArr(arr),"SEE");
//        System.out.println(res);
        res = word.exist(stringArrtoCharArr(arr), "ABCB");
        System.out.println(res);
    }

    public char[][] stringArrtoCharArr(String[] arr) {
        char[][] chars = new char[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            chars[i] = arr[i].toCharArray();
        }
        return chars;
    }

    @Test
    public void test80() {
        RemoveDuplicatesfromSortedArrayII_80 arr = new RemoveDuplicatesfromSortedArrayII_80();
        int[] a;
        int len;
        a = new int[]{1, 1};
        len = arr.removeDuplicates(a);
        System.out.println(len + "\n" + Arrays.toString(a));
        a = new int[]{1, 1, 1, 2, 2, 3};
        len = arr.removeDuplicates(a);
        System.out.println(len + "\n" + Arrays.toString(a));


    }

    @Test
    public void test81() {
        SearchinRotatedSortedArrayII_81 arr = new SearchinRotatedSortedArrayII_81();
        arr.search(new int[]{3, 1}, 1);
    }

    @Test
    public void test82() {
        RemoveDuplicatesfromSortedListII_82 remove = new RemoveDuplicatesfromSortedListII_82();
//        ListNode head = NodeListBuilder.BuildList(new int[]{1,2,3,3,4,4,5});
//        ListNode nHead  = remove.deleteDuplicates(head);
//        nHead.print();

        ListNode head1 = NodeListBuilder.BuildList(new int[]{1, 1, 1, 2});
        ListNode nHead1 = remove.deleteDuplicates(head1);
        nHead1.print();


    }

    @Test
    public void test83() {
        RemoveDuplicatesfromSortedList_83 remove = new RemoveDuplicatesfromSortedList_83();
        remove.deleteDuplicates(NodeListBuilder.BuildList(new int[]{1, 1, 2})).print();
        remove.deleteDuplicates(NodeListBuilder.BuildList(new int[]{1, 1, 2, 3, 3})).print();
        remove.deleteDuplicates(NodeListBuilder.BuildList(new int[]{1})).print();
        remove.deleteDuplicates(NodeListBuilder.BuildList(new int[]{1, 2, 3})).print();
    }
}
