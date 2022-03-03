package Micro.caprice.doublepointer.ARemoveElements;

/**
 * @program Before2020
 * @description: 844. 比较含退格的字符串
 * @author: ding
 * @create: 2022/03/02 22:54
 */
public class BackSpace {
	public static void main(String[] args) {
		System.out.println(new BackSpace().backspaceCompare("y#fo##f", "y#f#o##f"));
	}

	public boolean backspaceCompare(String s, String t) {
		return backString(s).equals(backString(t));
	}

	public String backString(String s) {
		StringBuilder sb = new StringBuilder();
		int slow = 0;
		int fast = 0;
		while (fast < s.length()) {
			if (s.charAt(fast) == '#') {
				if (slow > 0) {
					sb.deleteCharAt(--slow);
				}
			} else {
				sb.append(s.charAt(fast));
				slow++;
			}
			fast++;
		}
		return new String(sb);
	}
}
