package exercise.week07.LC074;

import java.util.Arrays;

/**
 * @description: 74.搜索二维矩阵
 * @author: Daniel Deen
 * @create: 2020-11-30 01:33
 */

public class LC074S1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        for (int[] m : matrix) {
            if (Arrays.binarySearch(m, target) > 0)
                return true;
        }
        return false;
    }
}
