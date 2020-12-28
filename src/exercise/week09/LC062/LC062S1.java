package exercise.week09.LC062;

/**
 * @description: 62.不同路径
 * @author: Daniel Deen
 * @create: 2020-12-15 23:55
 */

public class LC062S1 {
    public static void main(String[] args) {
        System.out.println(new LC062S1().uniquePaths(3, 7));
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j] +  dp[i][j - 1];
            }
        }

        return dp[m-1][n-1];
    }
}
