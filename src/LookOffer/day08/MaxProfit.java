package LookOffer.day08;

/**
 * @program Before2020
 * @description: 剑指 Offer 63. 股票的最大利润
 * @author: ding
 * @create: 2021/12/30 23:46
 */
public class MaxProfit {
	public int maxProfit(int[] prices) {
		int cost = Integer.MAX_VALUE, profit = 0;
		for (int price : prices) {
			cost = Math.min(cost, price);
			profit = Math.max(profit, price - cost);
		}
		return profit;
	}
}
