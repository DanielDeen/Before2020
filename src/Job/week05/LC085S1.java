package Job.week05;

/**
 * @description: 85.最大矩阵
 * @author: Daniel Deen
 * @create: 2021-04-22 23:29
 */

public class LC085S1 {
    public int maxSumSubmatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] sum = new int[m + 1][n + 1];

        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }

        int cur;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= i; k++) {
                    for (int l = 1; l <= j; l++) {
                        cur = sum[i][j] - sum[k - 1][j] - sum[i][l - 1] + sum[k - 1][l - 1];
                        if (cur == target) {
                            return cur;
                        }
                        if (cur > target) {
                            continue;
                        }
                        res = Math.max(res, cur);
                    }
                }

            }
        }
        return res;
    }
}
