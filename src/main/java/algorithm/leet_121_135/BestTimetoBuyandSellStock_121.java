package algorithm.leet_121_135;

/**
 * Created by songheng on 5/10/16.
 */
public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 1 || prices.length ==0){
            return 0;
        }
        int[] left = new int[prices.length + 1];
        left[0] = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.min(left[i - 1], prices[i - 1]);
            int profit  = prices[i] - left[i];
            if(profit > res){
                res = profit;
            }
        }
        return res;
    }
}
