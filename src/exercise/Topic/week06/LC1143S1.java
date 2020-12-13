package exercise.Topic.week06;

/**
 * @description: 1143.最长公共子序列
 * @author: Daniel Deen
 * @create: 2020-12-11 01:55
 */

public class LC1143S1 {
    public static void main(String[] args) {
        System.out.println(new LC1143S1().longestCommonSubsequence("abcde", "ace"));
    }


    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) return 0;
        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();
        int m = char1.length, n = char2.length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (char1[i - 1] == char2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
