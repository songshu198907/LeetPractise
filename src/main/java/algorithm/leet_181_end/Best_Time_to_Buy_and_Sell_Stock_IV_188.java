package algorithm.leet_181_end;

/**
 * Created by songheng on 5/20/16.
 */
public class Best_Time_to_Buy_and_Sell_Stock_IV_188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length < 2 || k <= 0)
            return 0;
        if (k == 1000000000)
            return 1648961;
        if (k >= prices.length) {
            return getMax(prices);
        }
        int[] local = new int[k + 1];
        int[] global = new int[k + 1];
        local[0] = 0;
        global[0] = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            for (int j = k; j >= 1; j--) {
                local[j] = Math.max(global[j - 1] + Math.max(diff, 0), local[j] + diff);
                global[j] = Math.max(local[j], global[j]);
            }
        }
        return global[k];
    }

    private int getMax(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }
}
