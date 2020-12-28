package exercise.week09.LC120;

import java.util.List;

/**
 * @description: 120.三角形的最小路径和
 * @author: Daniel Deen
 * @create: 2020-12-16 01:25
 */

public class LC120S1 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = dp[m - 1][0];
        for (int i = 0; i < m; i++) {
            minTotal = Math.min(dp[m - 1][i], minTotal);
        }
        return minTotal;
    }
}
