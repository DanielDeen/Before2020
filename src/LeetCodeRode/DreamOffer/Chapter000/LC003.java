package LeetCodeRode.DreamOffer.Chapter000;

import java.util.Map;

/**
 * @description: 搜索二维矩阵： 编写一个高效的算法，来搜索 m*n 矩阵 matrix 中的一个目标值 target
 *                  每行元素从左到右升序，每列从上到下升序
 * @author: Daniel Deen
 * @create: 2020-09-18 22:49
 */

public class LC003 {
    public static void main(String[] args) {
        int[][] t = {{1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(searchMatrix(t, 5));
    }

    private static boolean searchMatrixT(int[][] matrix, int target) {
        for (int[] m : matrix) {
            for (int i : m) {
                if (i == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 二分法： 重点
    private static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null ||matrix.length ==0){
            return false;
        }
        int shorterDim = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < shorterDim; i++) {
            boolean verticalFound = binarySearch(matrix, target, i, true);
            boolean horizontalFound = binarySearch(matrix, target, i, false);
            if (verticalFound || horizontalFound) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(
            int[][] matrix, int target, int start, boolean vertical) {
        int lo = start;
        int hi = vertical ? matrix[0].length -1 : matrix.length -1;

        while (hi >= lo){
            int mid = (lo + hi) / 2;
            if (vertical) {
                if (matrix[start][mid] < target) {
                    lo = mid + 1;
                } else if (matrix[start][mid] > target) {
                    hi = mid -1;
                } else {
                    return true;
                }
            } else {
                if (matrix[mid][start] < target) {
                    lo = mid + 1;
                } else if (matrix[mid][start] > target) {
                    hi = mid -1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
