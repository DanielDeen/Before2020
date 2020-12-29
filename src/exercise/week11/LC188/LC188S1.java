package exercise.week11.LC188;

/**
 * @description: 188.买卖股票的最佳时机IV
 * @author: Daniel Deen
 * @create: 2020-12-28 23:30
 */

public class LC188S1 {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (k == 0 || len < 2) return 0;

        if (k >= len / 2) {
            return commonMax(prices);
        }

        int[][] dp = new int[k + 1][2];
        for (int i = 0; i <= k; i++) {
            dp[i][1] = Integer.MIN_VALUE;
        }

        for (int price : prices) {
            for (int i = 1; i <= k; i++) {
                dp[i][1] = Math.max(dp[i][1], dp[i - 1][0] - price);
                dp[i][0] = Math.max(dp[i][0], dp[i][1] + price);
            }
        }

        return dp[k][0];
    }

    private int commonMax(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) res += prices[i] - prices[i - 1];
        }
        return res;
    }
}
