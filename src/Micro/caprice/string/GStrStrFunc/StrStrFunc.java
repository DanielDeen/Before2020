package Micro.caprice.string.GStrStrFunc;

import java.util.Locale;

/**
 * @program Before2020
 * @description: 28. 实现 strStr()
 * @author: ding
 * @create: 2022/03/01 00:45
 */
public class StrStrFunc {
	public static void main(String[] args) {

	}

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}

		int lenH = haystack.length();
		int lenN = needle.length();

		if (lenH < lenN) {
			return -1;
		}

		int index = 0;
		char[] s2 = needle.toCharArray();
		while (index < lenH - lenN + 1) {
			if (haystack.charAt(index) == needle.charAt(0)) {
				char[] s1 = haystack.substring(index, index + lenN).toCharArray();
				if (isEquals(s1, s2)) {
					return index;
				}
			}
			index++;
		}
		return -1;
	}

	public boolean isEquals(char[] s1, char[] s2) {
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}
}
