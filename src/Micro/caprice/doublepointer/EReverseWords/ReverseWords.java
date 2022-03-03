package Micro.caprice.doublepointer.EReverseWords;

/**
 * @program Before2020
 * @description: 151.翻转字符串里单词
 * @author: ding
 * @create: 2022/03/03 01:14
 */
public class ReverseWords {
	public static void main(String[] args) {
		System.out.println(new ReverseWords().reverseWords("a good   example"));
	}

	// 1. 去除空格
	// 2. 翻转字符串
	// 3. 翻转单词

	public String reverseWords(String s) {
		StringBuilder sb = removeSpace(s);
		reverseString(sb, 0, sb.length() - 1);
		int index = 0;
		for (int i = 0; i <= sb.length(); i++) {
			if (i == sb.length() || sb.charAt(i) == ' ') {
				reverseString(sb, index, i - 1);
				index = i + 1;
			}
		}
		return sb.toString();
	}

	public void reverseString(StringBuilder sb, int left, int right) {
		while (left <= right) {
			char temp = sb.charAt(left);
			sb.setCharAt(left, sb.charAt(right));
			sb.setCharAt(right, temp);

			left++;
			right--;
		}
	}

	public StringBuilder removeSpace(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (s.charAt(left) == ' ') {
			left++;
		}

		while (s.charAt(right) == ' ') {
			right--;
		}

		String newS = s.substring(left, right + 1);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < newS.length(); i++) {
			if (i > 0 && newS.charAt(i - 1) == ' ' && newS.charAt(i) == ' ') {
				continue;
			}
			sb.append(newS.charAt(i));
		}

		return sb;
	}
}
