package Micro.caprice.stackANDqueue.ABasic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 71. 简化路径
 * @author: ding
 * @create: 2022/03/08 00:06
 */
public class SimplifyPath {
	public static void main(String[] args) {
		String path = "/home//foo/";
		System.out.println(new SimplifyPath().simplifyPath1(path));
	}


	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		stack.push("/");

		String[] str = path.split("/");

		for (String s : str) {
			if (Objects.equals(s, "") && !Objects.equals(stack.peek(), "/")) {
				stack.push("/");
			} else if (s == "..") {
				stack.pop();
				stack.pop();
			} else if (Objects.equals(s, ".")) {
				continue;
			} else {
				stack.push(s);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stack.capacity(); i++) {
			sb.append(stack.pop());
		}

		return sb.toString();
	}


	public String simplifyPath1(String path) {
		String[] names = path.split("/");

		Deque<String> deque = new ArrayDeque<>();

		for (String name : names) {
			if ("..".equals(name)) {
				if (!deque.isEmpty()) {
					deque.pollLast();
				}
			} else if (name.length() > 0 && !".".equals(name)) {
				deque.offerLast(name);
			}
		}

		StringBuffer sb = new StringBuffer();
		if (deque.isEmpty()) {
			sb.append("/");
		} else {
			while (!deque.isEmpty()) {
				sb.append("/");
				sb.append(deque.pollFirst());
			}
		}
		return sb.toString();
	}
}
