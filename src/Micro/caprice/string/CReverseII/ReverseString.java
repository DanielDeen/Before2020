package Micro.caprice.string.CReverseII;

/**
 * @program Before2020
 * @description: 541. 反转字符串 II
 * @author: ding
 * @create: 2022/02/27 23:50
 */
public class ReverseString {
	public static void main(String[] args) {

	}

	public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i += 2 * k) {
			if (i + k <= chars.length) {
				reverse(chars, i, i + k - 1);
				continue;
			}

			reverse(chars, i, chars.length - 1);
		}

		return new String(chars);
	}

	public void reverse(char[] chars, int left, int right) {
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			left++;
			right--;
		}
	}
}
