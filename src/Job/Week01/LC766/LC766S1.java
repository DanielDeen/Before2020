package Job.Week01.LC766;

/**
 * @description: 766.托普利茨矩阵
 * @author: Daniel Deen
 * @create: 2021-02-23 23:23
 */

public class LC766S1 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
