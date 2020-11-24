package exercise.week06.LC064;

/**
 * @description: 最小路径和
 * @author: Daniel Deen
 * @create: 2020-11-23 23:34
 */

public class LC064S1 {
    public static void main(String[] args) {
        System.out.println(new LC064S1().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                } else if (i > 0 && j == 0) {
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                } else if (i == 0 && j == 0) {
                    dp[i][j] = dp[i][j] + grid[i][j];
                } else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[rows - 1][columns - 1];
    }
}
