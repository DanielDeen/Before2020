package Micro.caprice.hash.BValidAlphabet;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 438. 找到字符串中所有字母异位词
 * @author: ding
 * @create: 2022/02/26 23:05
 */
public class FindAnagram {
	public static void main(String[] args) {

	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < s.length() + 1 - p.length(); i++) {
			String str = s.substring(i, i + p.length());
			if (isAnagrams(str, p)) {
				ans.add(i);
			}
		}

		return ans;
	}

	public boolean isAnagrams(String s, String t) {
		int[] letters = new int[26];
		for (char c : s.toCharArray()) {
			letters[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			letters[c - 'a']--;
			if (letters[c - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
