package Micro.caprice.array.DminArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program Before2020
 * @description: 76.最小覆盖子串
 * @author: ding
 * @create: 2022/02/21 23:07
 */
public class MinWindows {

	Map<Character, Integer> ori = new HashMap<>();
	Map<Character, Integer> cnt = new HashMap<>();

	public static void main(String[] args) {
		System.out.println(new MinWindows().minWindows("A", "A"));
	}

	public String minWindows(String s, String t) {
		int tLen = t.length();
		for (int i = 0; i < tLen; i++) {
			char c = t.charAt(i);
			ori.put(c, ori.getOrDefault(c, 0) + 1);
		}

		int left = 0;
		int right = -1;
		int len = Integer.MAX_VALUE;
		int ansL = -1;
		int ansR = -1;
		int sLen = s.length();
		while (right < sLen) {
			++right;
			if (right < sLen && ori.containsKey(s.charAt(right))) {
				cnt.put(s.charAt(right), cnt.getOrDefault(s.charAt(right), 0) + 1);
			}

			while (check() && left <= right) {
				if (right - left + 1 < len) {
					len = right - left + 1;
					ansL = left;
					ansR = left + len;
				}

				if (ori.containsKey(s.charAt(left))) {
					cnt.put(s.charAt(left), cnt.getOrDefault(s.charAt(left), 0) - 1);
				}

				left++;
			}
		}

		return ansL == -1 ? "" : s.substring(ansL, ansR);
	}


	public boolean check() {
		for (Map.Entry<Character, Integer> characterIntegerEntry : ori.entrySet()) {
			Character key = (Character) ((Map.Entry<?, ?>) characterIntegerEntry).getKey();
			Integer val = (Integer) ((Map.Entry<?, ?>) characterIntegerEntry).getValue();
			if (cnt.getOrDefault(key, 0) < val) {
				return false;
			}
		}
		return true;
	}

}
