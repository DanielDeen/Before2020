package Job.Week03.LC224;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 224.基本计算器
 * @author: Daniel Deen
 * @create: 2021-03-10 22:11
 */

public class LC224S1 {
    public static void main(String[] args) {
        System.out.println(new LC224S1().calculate(" 2-1 + 2 "));
    }

    public int calculate(String s) {
        int res = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        int sign = 1;
        int len = s.length();

        int index = 0;
        while (index < len) {
            if (s.charAt(index) == ' ') {
                index++;
            } else if (s.charAt(index) == '+') {
                sign = stack.peek();
                index++;
            } else if (s.charAt(index) == '-') {
                sign = -stack.peek();
                index++;
            } else if (s.charAt(index) == '(') {
                stack.push(sign);
                index++;
            } else if (s.charAt(index) == ')') {
                stack.pop();
                index++;
            } else {
                long num = 0;
                while (index < len && Character.isDigit(s.charAt(index))) {
                    num = num * 10 + s.charAt(index) - '0';
                    index++;
                }
                res += sign * num;
            }
        }
        return res;
    }
}
