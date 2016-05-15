import algorithm.ListNode;
import algorithm.NodeListBuilder;
import algorithm.leet_136_150.LinkedListCycleII_142;
import algorithm.leet_136_150.ReorderList_143;
import algorithm.leet_136_150.WordBreakII_140;
import algorithm.leet_136_150.WordBreak_139;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by shu on 5/13/2016.
 */
public class CodeTest_136_150 {
    @Test
    public void test139() {
        WordBreak_139 word = new WordBreak_139();
        System.out.println(word.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", new HashSet<>(Arrays.asList(new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"}))));
        System.out.println(word.wordBreak("leetcode", new HashSet<>(Arrays.asList(new String[]{"leet", "code"}))));
    }

    @Test
    public void test140() {
        WordBreakII_140 word = new WordBreakII_140();
//        System.out.println(word.wordBreak("catsanddog", new HashSet<>(Arrays.asList(new String[]{"cat", "cats", "and", "sand", "dog", "c", "a", "t"}))));
//        System.out.println(word.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new HashSet<>(Arrays.asList(new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"}))));
        System.out.println(word.wordBreak("a", new HashSet<>(Arrays.asList(new String[]{"b"}))));

    }

    @Test
    public void test142() {
        LinkedListCycleII_142 linked = new LinkedListCycleII_142();
        ListNode f = new ListNode(3);
        ListNode s = new ListNode(2);
        ListNode t = new ListNode(0);
        ListNode fr = new ListNode(-4);
        f.next = f;
        s.next = t;
        t.next = fr;
        fr.next = t;
        System.out.println(linked.detectCycle(f).val);
    }

    @Test
    public void test143() {
        ReorderList_143 reorder = new ReorderList_143();
        ListNode head = NodeListBuilder.BuildList(new int[]{1, 2, 3});
        reorder.reorderList(head);
        head.print();
        head = NodeListBuilder.BuildList(new int[]{1, 2, 3, 4});
        reorder.reorderList(head);
        head.print();
    }
}
