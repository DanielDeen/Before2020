package Micro.caprice.string.FReverseLeftWord;

/**
 * @program Before2020
 * @description: 剑指 Offer 58 - II. 左旋转字符串
 * @author: ding
 * @create: 2022/03/01 00:26
 */
public class ReverseLeftWord {
	public static void main(String[] args) {
		System.out.println(new ReverseLeftWord().reverseLeftWords("abcdefg", 2));
	}


	public String reverseLeftWords(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = n; i < s.length(); i++) {
			sb.append(s.charAt(i));
		}

		for (int i = 0; i < n; i++) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
