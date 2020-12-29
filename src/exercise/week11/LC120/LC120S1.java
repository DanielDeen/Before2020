package exercise.week11.LC120;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 120.三角形的最小路径和
 * @author: Daniel Deen
 * @create: 2020-12-30 00:54
 */

public class LC120S1 {
    public static void main(String[] args) {

    }


    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) dp[i][j] = dp[i - 1][0] + triangle.get(i).get(j);
                else if (j == i) dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                else dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
        }
        return Arrays.stream(dp[m - 1]).min().getAsInt();
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[] dp = new int[m + 1];



        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
