package Job.Week01.LC832;

/**
 * @description: 832.翻转图像
 * @author: Daniel Deen
 * @create: 2021-02-24 23:36
 */

public class LC832S1 {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = m - 1;
            while (left<right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                left++;
                right++;
            }
            if (left == right) {
                A[i][left] ^= 1;
            }
        }
        return A;
    }
}
