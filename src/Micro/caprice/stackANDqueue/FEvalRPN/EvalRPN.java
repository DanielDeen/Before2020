package Micro.caprice.stackANDqueue.FEvalRPN;

import java.util.Objects;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 150. 逆波兰表达式求值
 * @author: ding
 * @create: 2022/03/05 00:20
 */
public class EvalRPN {
	public static void main(String[] args) {
		System.out.println(new EvalRPN().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
	}

	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			if (isOperator(token)) {
				int res = stack.pop();
				if (Objects.equals(token, "+")) {
					res += stack.pop();
				} else if (Objects.equals(token, "-")) {
					res -= stack.pop();
				} else if (Objects.equals(token, "*")) {
					res *= stack.pop();
				} else if (Objects.equals(token, "/")) {
					res /= stack.pop();
				}
				stack.push(res);
			} else {
				stack.push(Integer.parseInt(token));
			}
		}

		return stack.pop();
	}

	public boolean isOperator(String str) {
		return Objects.equals(str, "+") || Objects.equals(str, "-") || Objects.equals(str, "*") || Objects.equals(str, "/");
	}
}
