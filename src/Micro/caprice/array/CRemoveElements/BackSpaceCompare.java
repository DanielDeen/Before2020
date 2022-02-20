package Micro.caprice.array.CRemoveElements;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 844.比较含退格的字符串
 * @author: ding
 * @create: 2022/02/20 22:17
 */
public class BackSpaceCompare {
	public static void main(String[] args) {
		System.out.println(new BackSpaceCompare().backspaceCompare("a#c", "b"));
	}

	public boolean backspaceCompare(String s, String t) {
		return finalString(s).equals(finalString(t));
	}

	public String getNewString(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (res.length() == 0) {
					continue;
				}
				res.deleteCharAt(res.length() - 1);
			} else {
				res.append(s.charAt(i));
			}
		}

		return res.toString();
	}

	public String finalString(String s) {
		char[] res = s.toCharArray();
		int slow = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] != '#') {
				res[slow++] = res[i];
			} else {
				if (slow > 0) {
					slow--;
				}
			}
		}
		System.out.println(String.valueOf(res));
		System.out.println(Arrays.toString(res).substring(0, slow));

		return String.valueOf(res, 0,slow);
	}
}
