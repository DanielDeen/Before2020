package Job.week04;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 54.螺旋矩阵
 * @author: Daniel Deen
 * @create: 2021-03-15 22:38
 */

public class LC054S1 {

    public static void main(String[] args) {
        System.out.println(new LC054S1().spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> resultList = new ArrayList<>();
        if (matrix == null || rows == 0 || cols == 0) {
            return resultList;
        }
        boolean[][] visited = new boolean[rows][cols];
        int total = rows * cols;
        int row = 0, col = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            resultList.add(matrix[row][col]);
            visited[row][col] = true;

            int nextRow = row + directions[directionIndex][0], nextCol = col + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
        }
        return resultList;
    }

    public List<Integer> spiralOrder2(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> resultList = new ArrayList<>();
        if (matrix == null || rows == 0 || cols == 0) {
            return resultList;
        }

        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int col = left; col <= right; col++) {
                resultList.add(matrix[top][col]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                resultList.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int col = right - 1; col > left; col--) {
                    resultList.add(matrix[bottom][col]);
                }
                for (int row = bottom; row > top; row--) {
                    resultList.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return resultList;
    }
}
