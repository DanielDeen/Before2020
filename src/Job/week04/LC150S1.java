package Job.week04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 150.逆波兰表达式求值
 * @author: Daniel Deen
 * @create: 2021-03-20 23:43
 */

public class LC150S1 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isNumber(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
                continue;
            }
            int num2 = stack.pop();
            int num1 = stack.pop();
            switch (tokens[i]) {
                case "+":
                    stack.push(num1 + num2);
                    break;
                case "-":
                    stack.push(num1 - num2);
                    break;
                case "*":
                    stack.push(num1 * num2);
                    break;
                case "/":
                    stack.push(num1 / num2);
                    break;
                default:
            }

        }
        return stack.pop();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }
}
