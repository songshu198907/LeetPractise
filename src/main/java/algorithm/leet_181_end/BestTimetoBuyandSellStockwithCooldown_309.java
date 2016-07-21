package algorithm.leet_181_end;

/**
 * Created by songheng on 7/21/16.
 */
public class BestTimetoBuyandSellStockwithCooldown_309 {
    public int maxProfit(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int prey_buy = 0, sell = 0, prey_sell = 0;
        for (int price : prices) {
            prey_buy = buy;
            buy = Math.max(prey_buy, prey_sell - price);
            prey_sell = sell;
            sell = Math.max(prey_buy + price, prey_sell);
        }
        return sell;
    }
}
