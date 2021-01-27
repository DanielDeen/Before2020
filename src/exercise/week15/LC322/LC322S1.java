package exercise.week15.LC322;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description: 322.零钱兑换
 * @author: Daniel Deen
 * @create: 2021-01-27 01:56
 */

public class LC322S1 {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];

        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
