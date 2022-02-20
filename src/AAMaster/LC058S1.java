package AAMaster;

/**
 * @program Before2020
 * @description: 58.最后一个单词的长度
 * @author: ding
 * @create: 2021/09/21 23:32
 */
public class LC058S1 {
	public int lengthOfLastWord(String s) {
		String[] strs = s.split(" ");
		return strs[strs.length - 1].length();
	}
}
