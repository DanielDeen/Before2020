package Micro.caprice.stackANDqueue.ERemoveDuplicates;

import java.util.Stack;

/**
 * @program Before2020
 * @description: 1047. 删除字符串中的所有相邻重复项
 * @author: ding
 * @create: 2022/03/04 23:44
 */
public class RemoveDuplicates {
	public static void main(String[] args) {

	}

	public String removeDuplicates(String S) {
		Stack<Character> chars = new Stack<>();
		chars.push(S.charAt(0));
		int index = 1;
		while (index < S.length()) {
			char c = S.charAt(index);
			if (!chars.isEmpty() && c == chars.peek()) {
				chars.pop();
			} else {
				chars.push(c);
			}

			index++;
		}

		StringBuilder sb = new StringBuilder();
		while (!chars.isEmpty()) {
			sb.append(chars.pop());
		}
		return sb.reverse().toString();
	}
}
