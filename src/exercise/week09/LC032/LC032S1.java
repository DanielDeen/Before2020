package exercise.week09.LC032;

import java.util.Deque;
import java.util.Stack;

/**
 * @description: 32.最长有效括号
 * @author: Daniel Deen
 * @create: 2020-12-21 00:38
 */

public class LC032S1 {
    public int longestValidParentheses(String s) {
        int longest = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    longest = Math.max(longest, i - stack.peek());
                }
            }
        }
        return longest;
    }

    public int longestValidParenthesesI(String s) {
        int longest = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0);
                }
                longest = Math.max(longest, dp[i]);
            }
        }

        return longest;
    }

    public int longestValidParenthesesII(String s) {
        int left = 0, right = 0, longest = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                longest = Math.max(longest, right * 2);
            } else if (right > left) {
                right = left = 0;
            }
        }
        right = left = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                longest = Math.max(longest, right * 2);
            } else if (left > right) {
                right = left = 0;
            }
        }
        return longest;
    }
}
