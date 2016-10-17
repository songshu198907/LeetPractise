package round2;

import algorithm.second_round.leet_121_150.LRUCache;
import algorithm.second_round.leet_121_150.MaxPointsonLine_149;
import algorithm.second_round.leet_121_150.WordLadderII;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shu on 2016-10-16.
 */
public class CodeTest_121_150 {

    @Test
    public void test126() {
        WordLadderII wordLadderII = new WordLadderII();
        Set<String> set = new HashSet<>();
//        set.add("hot");
//        set.add("dog");
//        set.add("dot");
//        System.out.println(wordLadderII.findLadders("hot",
//                "dog",
//               set));
//
        String[] str = {"hot", "hit", "cog", "dot", "dog"};
        set = new HashSet<>(Arrays.asList(str));
        System.out.println(wordLadderII.findLadders("hit", "cog", set));
    }

    @Test
    public void test146() {
        LRUCache cache = new LRUCache(5);
        System.out.println(cache.get(2));
        cache.set(2, 2);
        cache.set(3, 3);
        cache.set(4, 4);
        cache.set(5, 5);
        System.out.println(cache.get(2));
        cache.set(6, 6);
        cache.set(7, 7);
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        cache.set(3, 2);
        cache.set(-1, 3);
        System.out.println(cache.get(5));
        System.out.println(cache.get(3));

    }

    @Test
    public void test149() {
        MaxPointsonLine_149 max = new MaxPointsonLine_149();
        System.out.println(max.maxPoints(new MaxPointsonLine_149.Point[]{
                new MaxPointsonLine_149.Point(0, 0)
        }));
        System.out.println(max.maxPoints(new MaxPointsonLine_149.Point[]{
                new MaxPointsonLine_149.Point(0, 0), new MaxPointsonLine_149.Point(1, 1), new MaxPointsonLine_149.Point(1, -1)
        }));
        System.out.println(max.maxPoints(new MaxPointsonLine_149.Point[]{
                new MaxPointsonLine_149.Point(0, 0), new MaxPointsonLine_149.Point(0, 0), new MaxPointsonLine_149.Point(0, 0)
        }));

    }


}
