package exercise.week05.LC1143;

/**
 * @description: 最长公共子序列
 * @author: Daniel Deen
 * @create: 2020-11-20 00:25
 */

public class LC1143S1 {
    public static void main(String[] args) {
        System.out.println(new LC1143S1().longestCommonSubsequence("bl", "yby"));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c1 = text1.charAt(i);
                char c2 = text2.charAt(j);

                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[m][n];
    }
}
