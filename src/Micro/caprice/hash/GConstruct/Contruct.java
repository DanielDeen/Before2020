package Micro.caprice.hash.GConstruct;

/**
 * @program Before2020
 * @description: 383. 赎金信
 * @author: ding
 * @create: 2022/02/27 21:28
 */
public class Contruct {
	public static void main(String[] args) {

	}

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] letters = new int[26];
		for (char c : magazine.toCharArray()) {
			letters[c - 'a']++;
		}

		for (char c : ransomNote.toCharArray()) {
			letters[c - 'a']--;
			if (letters[c - 'a'] < 0) {
				return false;
			}
		}

		return true;
	}
}
