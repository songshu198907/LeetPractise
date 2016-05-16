import algorithm.ListNode;
import algorithm.NodeListBuilder;
import algorithm.Point;
import algorithm.leet_136_150.*;
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

    @Test
    public void test146() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(2, 1);
        lruCache.set(1, 1);
        System.out.println(lruCache.get(2));
        lruCache.set(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));

    }

    @Test
    public void test147() {
        InsertionSortList_147 insert = new InsertionSortList_147();
        insert.insertionSortList(NodeListBuilder.BuildList(new int[]{2, 1})).print();
    }

    @Test
    public void test148() {
        SortList_148 sort = new SortList_148();
        sort.sortList(NodeListBuilder.BuildList(new int[]{1, 3, 4, 5, 6, 2})).print();
        sort.sortList(NodeListBuilder.BuildList(new int[]{1, 0, 1, 3})).print();
        sort.sortList(NodeListBuilder.BuildList(new int[]{1, 3, 4, 5, 6, 2})).print();
        sort.sortList(NodeListBuilder.BuildList(new int[]{2, 1})).print();
        sort.sortList(null);
    }

    @Test
    public void test149() {
        Max_Points_on_a_Line_149 max = new Max_Points_on_a_Line_149();
        Point[] points = new Point[]{
                new Point(0, 0), new Point(1, 1), new Point(), new Point(-2, -2)
        };

//        System.out.println(max.maxPoints(new Point[]{
//                new Point(0, 0), new Point(1, 1), new Point(), new Point(-2, -2)
//        }));
        System.out.println(max.maxPoints(new Point[]{
                new Point(0, 0), new Point(-1, -1), new Point(0, 0)
        }));
    }
}
