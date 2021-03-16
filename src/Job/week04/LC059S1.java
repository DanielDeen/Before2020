package Job.week04;

import java.util.Arrays;

/**
 * @description: 59.螺旋矩阵II
 * @author: Daniel Deen
 * @create: 2021-03-16 00:16
 */

public class LC059S1 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(new LC059S1().generateMatrix(3)));
    }


    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int total = n * n;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int index = 1;
        while (index <= total) {
            for (int col = left; col <= right; col++) {
                res[top][col] = index;
                index++;
            }
            for (int row = top + 1; row <= bottom; row++) {
                res[row][right] = index;
                index++;
            }
            if (left < right && top < bottom) {
                for (int col = right - 1; col > left; col--) {
                    res[bottom][col] = index;
                    index++;
                }
                for (int row = bottom; row > top; row--) {
                    res[row][left] = index;
                    index++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
