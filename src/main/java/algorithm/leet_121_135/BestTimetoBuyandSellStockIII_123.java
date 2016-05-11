package algorithm.leet_121_135;

/**
 * Created by songheng on 5/11/16.
 */
public class BestTimetoBuyandSellStockIII_123 {
    public int maxProfit(int[] prices) {
        int[] leftProfit = new int[prices.length];
        int[] rightProfit = new int[prices.length];
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        left[0] = prices[0];
        leftProfit[0] = 0;
        rightProfit[prices.length - 1] = 0;
        right[prices.length - 1] = prices[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.min(left[i - 1], prices[i - 1]);
            leftProfit[i] = Math.max(prices[i] - left[i], leftProfit[i - 1]);
        }

        for (int i = prices.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], prices[i + 1]);
            rightProfit[i] = Math.max(right[i] - prices[i], rightProfit[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < left.length; i++) {
            sum = Math.max(leftProfit[i] + rightProfit[i], sum);
        }
        return sum;
    }


}
