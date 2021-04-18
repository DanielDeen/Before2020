package Job.week05;

/**
 * @description: 263.丑数
 * @author: Daniel Deen
 * @create: 2021-04-10 22:58
 */

public class LC263S1 {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factor = new int[]{2, 3, 5};
        for (int f : factor) {
            while (n % f == 0) {
                n /= f;
            }
        }
        return n == 1;
    }
}
