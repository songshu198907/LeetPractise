package algorithm.leet_121_135;

/**
 * Created by songheng on 5/11/16.
 */
public class BestTimetoBuyandSellStockII_122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int low = prices[0];
        int high = -1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                if (high < 0) high = prices[i - 1];
                if (high > 0 && low >= 0) {
                    profit += Math.max(0, high - low);
                    high = -1;
                }
                low = prices[i];
            } else
                high = prices[i];
        }
        profit += Math.max(0, high - low);
        return profit;
    }
}
