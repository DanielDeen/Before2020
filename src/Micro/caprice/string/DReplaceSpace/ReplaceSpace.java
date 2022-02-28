package Micro.caprice.string.DReplaceSpace;

/**
 * @program Before2020
 * @description: 剑指 Offer 05. 替换空格
 * @author: ding
 * @create: 2022/02/28 21:39
 */
public class ReplaceSpace {
	public static void main(String[] args) {
		System.out.println(new ReplaceSpace().replaceSpace("we are young"));
	}

	public String replaceSpace(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				count++;
			}
		}

		int len = s.length() + count * 2;
		int sLen = s.length() - 1;

		char[] res = new char[s.length() + count * 2];

		for (int i = len - 1, j = sLen; j >= 0; j--) {
			if (s.charAt(j) == ' ') {
				res[i] = '0';
				res[i - 1] = '2';
				res[i - 2] = '%';
				i = i - 3;
				continue;
			}
			res[i] = s.charAt(j);
			i--;
		}

		return new String(res);
	}
}
