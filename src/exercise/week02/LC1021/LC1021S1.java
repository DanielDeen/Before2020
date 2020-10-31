package exercise.week02.LC1021;

import java.util.Stack;

/**
 * @description: 删除最外层的括号
 * @author: Daniel Deen
 * @create: 2020-10-29 00:06
 */

public class LC1021S1 {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses1(s));
    }

    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (char c : S.toCharArray()) {
            if (c == ')') index--;
            if (index > 0) sb.append(c);
            if (c == '(') index++;
        }

        return sb.toString();
    }

    public static String removeOuterParentheses1(String S) {
        Stack<Character> stack = new Stack<>();
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            if (stack.empty() && S.charAt(i) == '(') {
                stack.push(S.charAt(i));
                continue;
            }
            if (stack.size() == 1 && S.charAt(i) == ')') {
                stack.pop();
                continue;
            }
            if (S.charAt(i) == '(') {
                stack.push(S.charAt(i));
            }
            if (S.charAt(i) == ')') {
                stack.pop();
            }
            res += S.charAt(i) + "";
        }
        return res;
    }
}
