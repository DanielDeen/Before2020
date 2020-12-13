package exercise.week08.LC718;

import java.util.Map;

/**
 * @description: 718.最长重复子数组
 * @author: Daniel Deen
 * @create: 2020-12-13 23:55
 */

public class LC718S1 {
    public static void main(String[] args) {
        System.out.println(new LC718S1().findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
    }

    public int findLength(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        int res = 0;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                res = Math.max(dp[i][j], res);
            }
        }
        return res;
    }
}
