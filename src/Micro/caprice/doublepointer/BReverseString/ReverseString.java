package Micro.caprice.doublepointer.BReverseString;

/**
 * @program Before2020
 * @description: 344. 反转字符串
 * @author: ding
 * @create: 2022/03/03 00:48
 */
public class ReverseString {
	public static void main(String[] args) {

	}

	public void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		while (left <= right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;
		}
	}
}
