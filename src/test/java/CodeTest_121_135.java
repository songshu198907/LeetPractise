import algorithm.leet_121_135.BestTimetoBuyandSellStockIII_123;
import algorithm.leet_121_135.BestTimetoBuyandSellStockII_122;
import algorithm.leet_121_135.BestTimetoBuyandSellStock_121;
import org.junit.Test;

/**
 * Created by songheng on 5/10/16.
 */
public class CodeTest_121_135 {
    @Test
    public void test121(){
        BestTimetoBuyandSellStock_121 best = new BestTimetoBuyandSellStock_121();
        System.out.println(best.maxProfit(new int[]{1,2}));
    }

    @Test
    public void test122() {
        BestTimetoBuyandSellStockII_122 best = new BestTimetoBuyandSellStockII_122();
//        System.out.println(best.maxProfit(new int[]{1,2}));
//        System.out.println(best.maxProfit(new int[]{2,1}));
//        System.out.println(best.maxProfit(new int[]{2,1,4}));
        System.out.println(best.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void test123() {
        BestTimetoBuyandSellStockIII_123 best = new BestTimetoBuyandSellStockIII_123();
        System.out.println(best.maxProfit(new int[]{1, 5, 3, 7, 1, 9}));
        System.out.println(best.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0}));
    }
}
