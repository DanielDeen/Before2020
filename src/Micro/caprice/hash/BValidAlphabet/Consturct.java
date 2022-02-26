package Micro.caprice.hash.BValidAlphabet;

/**
 * @program Before2020
 * @description: 383.赎金信
 * @author: ding
 * @create: 2022/02/26 21:56
 */
public class Consturct {
	public static void main(String[] args) {
		System.out.println(new Consturct().canConstruct("aa", "aab"));
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		if (magazine.length() < ransomNote.length()) {
			return false;
		}

		int[] letter = new int[26];

		for (char c : magazine.toCharArray()) {
			letter[c - 'a']++;
		}

		for (char c : ransomNote.toCharArray()) {
			letter[c - 'a']--;
			if (letter[c - 'a'] < 0) {
				return false;
			}
		}

		return true;
	}
}
