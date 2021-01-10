package exercise.week12.LC123;

/**
 * @description: 123.买卖股票的最佳时机III
 * @author: Daniel Deen
 * @create: 2021-01-09 23:30
 */

public class LC123S1 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int len = prices.length;
        int[][][] dp = new int[len][3][2];

        dp[0][1][1] = -prices[0];
        dp[0][2][1] = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            dp[i][1][1] = Math.max(dp[i-1][1][1], -prices[i]);
            dp[i][1][0] = Math.max(dp[i-1][1][0], dp[i-1][1][1] + prices[i]);

            dp[i][2][1] = Math.max(dp[i-1][2][1], dp[i-1][1][0]-prices[i]);
            dp[i][2][0] = Math.max(dp[i-1][2][0], dp[i-1][2][1] + prices[i]);

        }
        return Math.max(dp[len - 1][1][0], dp[len - 1][2][0]);
    }
}
