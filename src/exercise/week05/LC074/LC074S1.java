package exercise.week05.LC074;

import java.util.Arrays;

/**
 * @description: 搜索二维矩阵
 * @author: Daniel Deen
 * @create: 2020-11-22 00:47
 */

public class LC074S1 {
    public static void main(String[] args) {
        System.out.println(new LC074S1().searchMatrix(new int[][]{{}}, 0));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int right = 0;
        int left = matrix[0].length - 1;
        while (right < matrix.length && left >= 0) {
            if (matrix[right][left] == target) return true;
            if (matrix[right][left] < target) {
                right++;
            } else {
                left--;
            }
        }
        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        for (int[] array :
                matrix) {
            if (Arrays.binarySearch(array, target) >= 0) {
                return true;
            }
        }
        return false;
    }
}
