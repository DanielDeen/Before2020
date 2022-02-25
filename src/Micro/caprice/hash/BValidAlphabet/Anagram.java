package Micro.caprice.hash.BValidAlphabet;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @program Before2020
 * @description: 242. 有效的字母异位词
 * @author: ding
 * @create: 2022/02/26 00:07
 */
public class Anagram {
	public static void main(String[] args) {
		System.out.println(new Anagram().isAnagram("aacc", "ccac"));
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		AtomicBoolean ans = new AtomicBoolean(true);
		Map<Character, Integer> sMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			sMap.put(c, sMap.getOrDefault(c, 0) + 1);
		}

		Map<Character, Integer> tMap = new HashMap<>();
		for (char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}

		sMap.forEach((k, v) -> {
			if (!tMap.containsKey(k) || !tMap.get(k).equals(v)) {
				ans.set(false);
			}
		});
		return ans.get();
	}


	public boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] temp = new int[26];
		for (char c : s.toCharArray()) {
			temp[c - 'a']++;
		}

		for (char c : t.toCharArray()) {
			temp[c - 'a']--;
			if (temp[c - 'a'] < 0) {
				return false;
			}
		}


//		int len = s.length();
//		for (int i = 0; i < len; i++) {
//			temp[s.charAt(i) - 'a']++;
//			temp[t.charAt(i) - 'a']--;
//		}
//
//		for (int i = 0; i < 26; i++) {
//			if (temp[i] != 0) {
//				return false;
//			}
//		}
		return true;
	}
}
