package Micro.caprice.backtracking.CSplitPartition;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 131. 分割回文串
 * @author: ding
 * @create: 2022/05/06 23:20
 */
public class Partition {
	List<List<String>> res = new ArrayList<>();
	LinkedList<String> path = new LinkedList<>();

	public List<List<String>> partition(String s) {
		backtracking(s, 0);
		return res;
	}

	public void backtracking(String s, int index) {
		if (index >= s.length()) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = index; i < s.length(); i++) {
			if (isPalindrome(s, index, i)) {
				path.add(s.substring(index, i + 1));
			} else {
				continue;
			}
			backtracking(s, i + 1);
			path.removeLast();
		}

	}

	public boolean isPalindrome(String str, int start, int end) {
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
