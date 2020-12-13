package exercise.week08.LC191;

/**
 * @description: 191.位1的个数
 * @author: Daniel Deen
 * @create: 2020-12-12 01:06
 */

public class LC191S1 {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
