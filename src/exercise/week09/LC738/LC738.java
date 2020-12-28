package exercise.week09.LC738;

/**
 * @description: 738.单调递增的数字
 * @author: Daniel Deen
 * @create: 2020-12-15 01:46
 */

public class LC738 {
    public static void main(String[] args) {
        System.out.println(new LC738().monotoneIncreasingDigits(332));
    }

    public int monotoneIncreasingDigits(int N) {
        String s = String.valueOf(N);
        char[] chars = s.toCharArray();
        int flag = s.length();
        for (int i = s.length() - 1; i > 0 ; i--) {
            if (chars[i] < chars[i-1]) {
                chars[i-1]--;
                flag = i;
            }
        }
        for (int i = flag; i < s.length() ; i++) {
            chars[i] = '9';
        }

        return Integer.parseInt(new String(chars));
    }
}
