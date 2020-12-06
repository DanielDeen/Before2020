package exercise.week06.LC363;

/**
 * @description: 363.矩形区域不超过K的最大数值和
 * @author: Daniel Deen
 * @create: 2020-11-27 22:11
 */

public class LC363S1 {

    public static void main(String[] args) {
        System.out.println(new LC363S1().maxSumSubmatrix(new int[][]{{2, 2, -1}}, 2));
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int l = 0; l < col; l++) {
            int[] rowSum = new int[row];
            for (int r = l; r < col; r++) {
                for (int i = 0; i < row; i++) {
                    rowSum[i] += matrix[i][r];
                }
                max = Math.max(max, dpMax(rowSum, k));
            }
        }
        return max;
    }

    private int dpMax(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max && sum <= k) max = sum;
            }
        }
        return max;
    }
}
