package exercise.week10.LC122;

/**
 * @description: 122.买卖股票的最佳时机II
 * @author: Daniel Deen
 * @create: 2020-12-26 00:12
 */

public class LC122S1 {
    public static void main(String[] args) {
        System.out.println(new LC122S1().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - prices[i - 1], 0) + maxProfit;
        }
        return maxProfit;
    }
}
