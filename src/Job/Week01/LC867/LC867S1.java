package Job.Week01.LC867;

/**
 * @description: 867.转置矩阵
 * @author: Daniel Deen
 * @create: 2021-02-25 08:03
 */

public class LC867S1 {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] transposed = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
