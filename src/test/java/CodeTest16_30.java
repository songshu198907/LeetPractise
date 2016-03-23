import algorithm.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by songheng on 3/17/16.
 */
public class CodeTest16_30 {
    @Test
    public  void testThreeSumClose(){
        ThreeSumCloset_16 sum = new ThreeSumCloset_16();
       int closet =  sum.threeSumClosestFaster(new int[]{
               1,2,4,8,16,32,64,128
        },82);
        System.out.println(closet);
    }
    @Test
    public  void testPhoneCombinations(){
        CombinationsofPhoneNumber_17 com = new CombinationsofPhoneNumber_17();
        System.out.println(com.letterCombinations("23"));
    }
    @Test
    public void testFourSum(){
        FourSum_18 four = new FourSum_18();
        System.out.println( four.fourSum(new int[]{
                0,0,0,0
        },0));
//        System.out.println( four.fourSum(new int[]{
//                1, 0 ,-1, 0, -2, 2
//        },0));
    }
    @Test
    public void testRemoveNode(){
        RemoveNthNode_19 node = new RemoveNthNode_19();
        RemoveNthNode_19.ListNode head = new RemoveNthNode_19.ListNode(-1);
//        node.removeNthFromEnd()
    }

    @Test
    public void testParentheses(){
        ValidParentheses_20 parentheses = new ValidParentheses_20();
        System.out.println( parentheses.isValid("([])"));
    }
    @Test
    public void testGenerateParentheses(){
        GenerateParentheses_22 pa = new GenerateParentheses_22();
//        System.out.println(pa.generateParenthesis(3));
        System.out.println(pa.generateParenthesisBetter(3));
    }

    @Test
    public  void  testMerge(){
        MergekSortedLists_23_2 merge = new MergekSortedLists_23_2();
//        ListNode node1 = merge.buildList(new int[]{1,3,5,7,9});
//        ListNode node2 = merge.buildList(new int[]{2,4,6,8,10});
//
//       ListNode result = merge.mergeKLists(new ListNode[]{
//                node1,
//                node2
//        });
//        result.print();
        ListNode node1 = null;
        ListNode node2 = merge.buildList(new int[]{2,4,6,8,10});

        ListNode result = merge.mergeKLists(new ListNode[]{
                node1,
                node2
        });
        result.print();

    }
    @Test
    public void testSwapinPairs(){
        SwapNodesinPairs_24 swap = new SwapNodesinPairs_24();
        ListNode head = swap.buildList(new int[]{1,2});
        head = swap.swapPairs(head);
        head.print();

    }
    @Test
    public void  testSwapInKParis(){
        ReverseNodesinKGroup_25 reverse = new ReverseNodesinKGroup_25();
        ListNode node = NodeListBuilder.BuildList(new int[]{
                1,2

        });
        node = reverse.reverseKGroup(node,3);
        node.print();
    }
    @Test
    public void testDuplicatesArray(){
        RemoveDuplicatesfromSortedArray_26 remove = new RemoveDuplicatesfromSortedArray_26();
        int[] arr = new int[]{
                1,1,2};
        System.out.println(remove.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testRemoveElement(){
        RemoveElement_27 remove = new RemoveElement_27();
        int[] arr = new int[]{
                3,2,2,3};
        System.out.println(remove.removeElementFaster(arr,3));
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testStrSTR(){
        ImplementstrStr_28 str = new ImplementstrStr_28();
//        System.out.println(str.strStr("mississippi",
//                "issip"));
        System.out.println(str.strStrSunny("mississippi",
                "pi"));
    }

    @Test
    public void testDivide() {
        DivideTwoIntegers_29 devide = new DivideTwoIntegers_29();
        int result = devide.divide(-2147483648,
                2);
        System.out.println(result);
    }
}
