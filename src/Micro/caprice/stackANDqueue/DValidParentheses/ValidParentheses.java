package Micro.caprice.stackANDqueue.DValidParentheses;

import java.util.Stack;

/**
 * @program Before2020
 * @description: 20.有效的括号
 * @author: ding
 * @create: 2022/03/04 22:50
 */
public class ValidParentheses {
	public static void main(String[] args) {

	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		int index = 0;
		while (index < s.length()) {
			char c = s.charAt(index);
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
				continue;
			}

			switch (c) {
				case ']':
					if (stack.isEmpty() || stack.pop() != '[') {
						return false;
					}
					break;
				case '}':
					if (stack.isEmpty() || stack.pop() != '{') {
						return false;
					}
					break;
				case ')':
					if (stack.isEmpty()  || stack.pop() != '(') {
						return false;
					}
					break;
			}
			index++;
		}
		return stack.isEmpty();
	}
}
