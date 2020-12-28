package exercise.week10.LC085;

/**
 * @description: 85.最大矩形
 * @author: Daniel Deen
 * @create: 2020-12-26 00:38
 */

public class LC085S1 {
    public static void main(String[] args) {
        System.out.println(new LC085S1().maximalRectangle(new char[][]{
                {'0','0','0'},
                {'0','0','0'},
                {'1','1','1'}
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
        }));
    }


    public int maximalRectangle(char[][] matrix) {
        int maxAre = 0;
        if (matrix.length == 0 || matrix[0].length == 0) return maxAre;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) dp[i][j] = matrix[i][j] == '0' ? 0 : 1;
                else dp[i][j] = matrix[i][j] == '0' ? 0 : dp[i][j - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') continue;
                int width = dp[i][j];
                int area = width;
                for (int k = i - 1; k >= 0; k--) {
                    width = Math.min(width, dp[k][j]);
                    area = Math.max(area, (i - k + 1) * width);
                }
                maxAre = Math.max(maxAre, area);
            }
        }
        return maxAre;
    }
}
