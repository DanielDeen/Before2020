package Micro.caprice.string.EReverseWord;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 151.翻转字符串里的单词
 * @author: ding
 * @create: 2022/02/28 22:47
 */
public class ReverseWords {
	public static void main(String[] args) {
		System.out.println("====" + new ReverseWords().reverseWords("   the sky is      blue    ") + "====");
	}

	// 1. 移除多余空格
	// 2. 反转字符串
	// 3. 反转单词

	public String reverseWords(String s) {
		StringBuilder sb = removeUnnecessarySpace(s);
		reverseString(sb, 0, sb.length() - 1);
		int slow = 0;
		int fast = 0;
		while (fast < sb.length()) {
			while ((fast < sb.length()) && (sb.charAt(fast) != ' ')) {
				fast++;
			}
			reverseString(sb, slow, fast - 1);
			slow = fast + 1;
			fast = fast + 1;
		}

		return sb.toString();
	}

	public StringBuilder removeUnnecessarySpace(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (s.charAt(left) == ' ') {
			left++;
		}

		while (s.charAt(right) == ' ') {
			right--;
		}

		String newString = s.substring(left, right + 1);

		left = 0;

		StringBuilder sb = new StringBuilder();
		while (left < newString.length()) {
			while (newString.charAt(left) == ' ' && newString.charAt(left - 1) == ' ') {
				left++;
			}
			sb.append(newString.charAt(left++));
		}
		return sb;

	}

	public void reverseString(StringBuilder s, int left, int right) {
		while (left < right) {
			char temp = s.charAt(left);
			s.setCharAt(left, s.charAt(right));
			s.setCharAt(right, temp);

			left++;
			right--;
		}
	}
}
