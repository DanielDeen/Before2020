package exercise.week15.LC005;

import java.util.stream.Stream;

/**
 * @description: 5.最长回文子串
 * @author: Daniel Deen
 * @create: 2021-01-29 02:23
 */

public class LC005S1 {
    public static void main(String[] args) {
        System.out.println(new LC005S1().longestPalindrome("aacabdkacaa"));
    }

    public String longestPalindrome(String s) {
        String origin = s;
        String reverse = new StringBuilder(s).reverse().toString();
        int len = s.length();
        int[][] dp = new int[len][len];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
                if (dp[i][j] > maxLen) {
                    int preRev = len - 1 - j;
                    if (preRev + dp[i][j] == i + 1) {
                        maxLen = dp[i][j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }

    public String longestPalindrome1(String s) {
        int len = s.length();
        String res = s.charAt(0) + "";
        for (int i = 0; i < len; i++) {
            int left = len;
            while (left > i) {
                String temp = s.substring(i, left);
                if (isPalindrome(temp) && temp.length() > res.length()) {
                    res = temp;
                }
                left--;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 1) return false;
        char[] c = s.toCharArray();
        int right = c.length - 1, left = 0;
        while (left < right) {
            if (c[left] != c[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
