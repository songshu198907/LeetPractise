import algorithm.leet_321_350.Coin_Change_322;
import org.junit.Test;

/**
 * Created by shu on 7/24/2016.
 */
public class CodeTest_321_350 {
    @Test
    public void test321() {
        Coin_Change_322 coin = new Coin_Change_322();
        System.out.println(coin.coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coin.coinChange(new int[]{2}, 3));
        System.out.println(coin.coinChange(new int[]{1, 2, 5}, 100));
        System.out.println(coin.coinChange(new int[]{186, 419, 83, 408}, 6249));
        System.out.println(coin.coinChange2(new int[]{1, 2, 5}, 11));
        System.out.println(coin.coinChange2(new int[]{2}, 3));
        System.out.println(coin.coinChange2(new int[]{1, 2, 5}, 100));
        System.out.println(coin.coinChange2(new int[]{186, 419, 83, 408}, 6249));
    }
}
