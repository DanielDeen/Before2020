package exercise.week09.LC316;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @description: 316.去除重复字母
 * @author: Daniel Deen
 * @create: 2020-12-20 01:08
 */

public class LC316S1 {
    public static void main(String[] args) {
        System.out.println(new LC316S1().removeDuplicateLetters("cbacdcbc"));
    }

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            while (!stack.empty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(c);
        }
        String res = "";
        for (char c : stack) {
            res += c;
        }
        return res;
    }
}
