package LeetCodeRode.DreamOffer.Chapter001;

import java.util.Arrays;

/**
 * @description: 验证回文串：给定一个字符串，验证它是否是回文串，只考虑字母和数字，忽略大小写
 * @author: Daniel Deen
 * @create: 2020-09-22 00:16
 */

public class LC001 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
