package Job.Week01.LC896;

/**
 * @description: 896.单调数列
 * @author: Daniel Deen
 * @create: 2021-02-28 23:13
 */

public class LC896S1 {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                dec = false;
            }
            if (A[i] > A[i + 1]) {
                inc = false;
            }
        }

        return dec || inc;
    }
}
