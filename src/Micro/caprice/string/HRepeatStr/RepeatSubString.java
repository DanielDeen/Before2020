package Micro.caprice.string.HRepeatStr;

/**
 * @program Before2020
 * @description: 459. 重复的子字符串
 * @author: ding
 * @create: 2022/03/02 00:04
 */
public class RepeatSubString {
	public static void main(String[] args) {
		System.out.println(new RepeatSubString().repeatedSubstringPattern("abababaaba"));
	}

	public boolean repeatedSubstringPattern(String s) {

		// buildNext
		int len = s.length();
		int[] next = new int[len];
		int index = 0;
		for (int i = 1; i < len; i++) {
			while (index > 0 && s.charAt(i) != s.charAt(index)) {
				index = next[index - 1];
			}
			if (s.charAt(i) == s.charAt(index)) {
				index++;
			}
			next[i] = index;
		}

		return (next[len- 1] != 0 && (len % (len - (next[len-1])) == 0));
	}
}
