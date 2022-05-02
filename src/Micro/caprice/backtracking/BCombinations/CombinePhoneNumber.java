package Micro.caprice.backtracking.BCombinations;

import java.util.*;

/**
 * @program Before2020
 * @description: 17. 电话号码的字母组合
 * @author: ding
 * @create: 2022/04/27 22:40
 */
public class CombinePhoneNumber {
	public static void main(String[] args) {
		System.out.println(new CombinePhoneNumber().letterCombinations("23"));
	}

	Map<Character, String[]> numberMap;
	List<String> list;

	String[] letterMap = {" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public List<String> letterCombinations1(String digits) {
		List<String> list = new ArrayList<>();
		solve(digits, 0, new StringBuffer(), list);
		return list;
	}

	private void solve(String digits, int index, StringBuffer sb, List<String> list) {
		if (digits.length() == 0) {
			return;
		}

		if (index >= digits.length()) {
			list.add(new String(sb));
			return;
		}

		String s = letterMap[digits.charAt(index) - '0'];
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			solve(digits, ++index, sb, list);
			sb.deleteCharAt(sb.length() - 1);
		}
	}


	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0) {
			return Collections.emptyList();
		}

		init();
		char[] chars = digits.toCharArray();
		backtracking(chars, new StringBuffer(), 0);
		return list;
	}

	private void backtracking(char[] chars, StringBuffer tmp, int startIndex) {
		if (tmp.length() == chars.length) {
			list.add(tmp.toString());
			return;
		}

		String[] curStr = numberMap.get(chars[startIndex]);
		for (String s : curStr) {
			tmp.append(s);
			backtracking(chars, tmp, ++startIndex);
			--startIndex;
			tmp.deleteCharAt(tmp.length() - 1);
		}
	}

	private void init() {
		list = new ArrayList<>();
		numberMap = new HashMap<>();
		numberMap.put('2', new String[]{"a", "b", "c"});
		numberMap.put('3', new String[]{"d", "e", "f"});
		numberMap.put('4', new String[]{"g", "h", "i"});
		numberMap.put('5', new String[]{"j", "k", "l"});
		numberMap.put('6', new String[]{"m", "n", "o"});
		numberMap.put('7', new String[]{"p", "q", "r", "s"});
		numberMap.put('8', new String[]{"t", "u", "v"});
		numberMap.put('9', new String[]{"w", "x", "y", "z"});
	}
}
