package Job.Week03.LC1047;

/**
 * @description: 1047.删除字符串中的所有相邻重复项
 * @author: Daniel Deen
 * @create: 2021-03-09 22:27
 */

public class LC1047S1 {
    public String removeDuplicates(String S) {
        StringBuffer sb = new StringBuffer();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (top >= 0 && sb.charAt(top) == ch) {
                sb.deleteCharAt(top);
                top--;
            } else {
                sb.append(ch);
                top++;
            }
        }
        return sb.toString();
    }
}
