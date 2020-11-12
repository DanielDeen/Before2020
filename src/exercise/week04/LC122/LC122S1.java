package exercise.week04.LC122;

/**
 * @description: 买卖股票的最佳时机II
 * @author: Daniel Deen
 * @create: 2020-11-11 21:47
 */

public class LC122S1 {
    public int maxProfit(int[] prices) {
        int profile = 0;
        for (int i = 1; i < prices.length; i++) {
            profile += Math.max(0 , prices[i] - prices[i-1]);
        }
        return profile;
    }
}
