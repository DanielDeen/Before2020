package exercise.week09.LC680;

/**
 * @description: 680.验证回文字符串II
 * @author: Daniel Deen
 * @create: 2020-12-20 00:40
 */

public class LC680S1 {
    public static void main(String[] args) {
        System.out.println(new LC680S1().validPalindrome("abc"));
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return validPalindromeII(s.substring(left + 1, right + 1)) || validPalindromeII(s.substring(left, right));
            }
        }
        return true;
    }

    public boolean validPalindromeII(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
