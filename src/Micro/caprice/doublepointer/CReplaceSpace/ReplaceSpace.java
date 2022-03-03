package Micro.caprice.doublepointer.CReplaceSpace;

/**
 * @program Before2020
 * @description: 剑指 Offer 05. 替换空格
 * @author: ding
 * @create: 2022/03/03 00:52
 */
public class ReplaceSpace {
	public static void main(String[] args) {

	}

	public String replaceSpace(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				count++;
			}
		}

		int newLen = s.length() + 2 * count;
		int index = newLen - 1;
		char[] newChars = new char[newLen];
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				newChars[index--] = '0';
				newChars[index--] = '2';
				newChars[index--] = '%';
			} else {
				newChars[index--] = s.charAt(i);
			}
		}
		return String.valueOf(newChars);
	}
}
