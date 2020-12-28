package exercise.week10.LC387;

/**
 * @description: 387.字符串中的第一个唯一字符
 * @author: Daniel Deen
 * @create: 2020-12-23 00:43
 */

public class LC387S1 {
    public int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) == s.lastIndexOf(i) && s.indexOf(i) != -1) {
                min = Math.min(min, s.indexOf(i));
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
