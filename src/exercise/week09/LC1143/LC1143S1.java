package exercise.week09.LC1143;

/**
 * @description: 1143.最长公共子序列
 * @author: Daniel Deen
 * @create: 2020-12-15 01:31
 */

public class LC1143S1 {
    public static void main(String[] args) {
        System.out.println(new LC1143S1().longestCommonSubsequence("abcde", "ace"));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
