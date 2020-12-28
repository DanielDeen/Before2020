package exercise.week09.LC714;

/**
 * @description: 714.买卖股票的最佳时机含手续费
 * @author: Daniel Deen
 * @create: 2020-12-17 00:28
 */

public class LC714S1 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        // dp 是利润; 0 代表 没有时的利润、1 代表 持有时的利润
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        int sell = 0, buy = -prices[0];
        for (int i = 1; i < n; i++) {
            sell = Math.max(sell, buy + prices[i] - fee);
            buy = Math.max(buy, sell - prices[i]);
        }

        return sell;
    }
}
