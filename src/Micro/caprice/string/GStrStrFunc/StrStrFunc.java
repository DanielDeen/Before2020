package Micro.caprice.string.GStrStrFunc;

/**
 * @program Before2020
 * @description: 28. 实现 strStr()
 * @author: ding
 * @create: 2022/03/01 00:45
 */
public class StrStrFunc {
	public static void main(String[] args) {
		System.out.println(new StrStrFunc().strStr1("adcadcaddcadde", "adcadde"));
	}

	// KMP 算法理论篇：https://www.bilibili.com/video/BV1PD4y1o7nd/?spm_id_from=333.788
	// KMP 代码： https://www.bilibili.com/video/BV1M5411j7Xx/?spm_id_from=333.788

	public int strStr1(String haystack, String needle) {
		int[] next = buildNext(needle);
		int lenH = haystack.length();
		int index = 0;
		for (int i = 0; i < lenH; i++) {
			while (index > 0 && haystack.charAt(i) != needle.charAt(index)) {
				index = next[index - 1];
			}
			if (haystack.charAt(i) == needle.charAt(index)) {
				index++;
			}

			if (index == needle.length()) {
				return (i - index + 1);
			}
		}
		return -1;
	}


	public int[] buildNext(String s) {
		int[] next = new int[s.length()];
		int index = 0;
		for (int i = 1; i < next.length; i++) {
			while (index > 0 && s.charAt(i) != s.charAt(index)) {
				index = next[index - 1];
			}
			if (s.charAt(i) == s.charAt(index)) {
				index++;
			}
			next[i] = index;
		}
		return next;
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
