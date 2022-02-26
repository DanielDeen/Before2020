package Micro.caprice.hash.BValidAlphabet;

import java.util.*;

/**
 * @program Before2020
 * @description: 49.字母异位词分组
 * @author: ding
 * @create: 2022/02/26 22:07
 */
public class GroupAnagram {
	public static void main(String[] args) {

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ans = new ArrayList<>();
		Set<String> isAdd = new HashSet<>();
		for (String s : strs) {
			if (isAdd.contains(s)) {
				continue;
			}
			List<String> list = new ArrayList<>();
			list.add(s);
			for (String s1 : strs) {
				if (s1.equals(s)) {
					continue;
				}
				if (isAnagram(s, s1)) {
					list.add(s1);
					isAdd.add(s1);
				}
			}
			ans.add(list);
		}
		return ans;
	}

	public boolean isAnagram(String s, String t) {
		if (s.equals(t)) {
			return true;
		}
		int[] letters = new int[128];
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

	public List<List<String>> groupAnagrams1(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			int[] letters = new int[26];
			for (char c : str.toCharArray()) {
				letters[c - 'a']++;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 26; i++) {
				if (letters[i] != 0) {
					sb.append((char) i + 'a');
					sb.append(letters[i]);
				}
			}

			String mapKey = sb.toString();
			List<String> list = map.getOrDefault(mapKey, new ArrayList<>());
			list.add(str);
			map.put(mapKey, list);
		}

		return new ArrayList<>(map.values());
	}

}
