package exercise.week09.LC738;

/**
 * @description: 738.单调递增的数字
 * @author: Daniel Deen
 * @create: 2020-12-16 01:28
 */

public class LC738S2 {
    public int monotoneIncreasingDigits(int N) {
        char[] chars = (N + "").toCharArray();
        int index = chars.length;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] < chars[i - 1]) {
                chars[i-1]--;
                index = i;
            }
        }

        for (int i = index; i <= chars.length; i++) {
            chars[i] = '9';
        }

        return Integer.parseInt(new String(chars));
    }
}
