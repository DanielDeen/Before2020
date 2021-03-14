package Job.Week03.LC227;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 227.基本计算器II
 * @author: Daniel Deen
 * @create: 2021-03-11 23:24
 */

public class LC227S1 {
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        char sign = '+';
        int num = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == len - 1) {
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
