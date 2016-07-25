package algorithm.leet_321_350;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shu on 7/24/2016.
 */
public class Coin_Change_322 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        Queue<Integer> queue = new LinkedList<>();
        int[] help = new int[amount];
        queue.offer(amount);
        int layer = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int rm = queue.poll();
                for (int j = coins.length - 1; j >= 0; j--) {
                    int cur = rm - coins[j];
                    if (cur > 0) {
                        if (help[cur] == 0) {
                            queue.offer(cur);
                            help[cur] = 1;
                        }
                    }
                    if (cur == 0) {
                        return layer;
                    }
                }
            }
            layer++;
        }
        return -1;
    }


    public int coinChange2(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }


}
