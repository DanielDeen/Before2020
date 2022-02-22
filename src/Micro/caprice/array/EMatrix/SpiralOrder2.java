package Micro.caprice.array.EMatrix;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 剑指 Offer 29. 顺时针打印矩阵
 * @author: ding
 * @create: 2022/02/22 22:29
 */
public class SpiralOrder2 {
	public static void main(String[] args) {
		int[][] matrix = {{}};
		System.out.println(Arrays.toString(new SpiralOrder2().spiralOrder(matrix)));
	}

	public int[] spiralOrder(int[][] matrix) {
		if (matrix.length == 0) {
			return new int[0];
		}


		int left = 0;
		int right = matrix[0].length;
		int top = 0;
		int bottom = matrix.length;

		int index = 0;

		int[] res = new int[right * bottom];

		right--;
		bottom--;

		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				res[index++] = matrix[top][i];
			}
			for (int i = top + 1; i <= bottom; i++) {
				res[index++] = matrix[i][right];
			}

			if (left < right && top < bottom) {
				for (int i = right - 1; i > left; i--) {
					res[index++] = matrix[bottom][i];
				}
				for (int i = bottom; i > top; i--) {
					res[index++] = matrix[i][left];
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
