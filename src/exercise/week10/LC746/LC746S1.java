package exercise.week10.LC746;

/**
 * @description: 746.使用最小花费爬楼梯
 * @author: Daniel Deen
 * @create: 2020-12-21 02:13
 */

public class LC746S1 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[cost.length];
    }
}
