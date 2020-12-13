package exercise.week08.LC231;

/**
 * @description: 231.2的幂
 * @author: Daniel Deen
 * @create: 2020-12-12 01:19
 */

public class LC231S1 {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        if (n == 1 || n == 2) return true;
        while (n > 1) {
            if (n % 2 > 0) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }
}
