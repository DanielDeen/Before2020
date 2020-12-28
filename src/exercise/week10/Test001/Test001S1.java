package exercise.week10.Test001;

/**
 * @description: Test001
 * @author: Daniel Deen
 * @create: 2020-12-27 21:24
 */

public class Test001S1 {
    public static void main(String[] args) {
        System.out.println(new Test001S1().numDecodings("226"));
    }


    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < s.length() + 1; i++) {
            if ((s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2') && s.charAt(i - 1) < '7') {
                dp[i] += dp[i - 2];
            }
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
        }
        return dp[s.length()];
    }
}
