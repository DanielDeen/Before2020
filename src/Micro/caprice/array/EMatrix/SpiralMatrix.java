package Micro.caprice.array.EMatrix;

/**
 * @program Before2020
 * @description: 59.螺旋矩阵II
 * @author: ding
 * @create: 2022/02/22 00:40
 */
public class SpiralMatrix {
	public static void main(String[] args) {
		new SpiralMatrix().generateMatrix(5);
	}


	public int[][] generateMatrix(int n) {
		int[][] res = new int[n][n];

		int index = 1;

		int left = 0;
		int right = n - 1;
		int top = 0;
		int bottom = n - 1;

		while (index <= n * n) {
			for (int i = left; i <= right; i++) {
				res[top][i] = index++;
			}
			for (int i = top + 1; i <= bottom; i++) {
				res[i][right] = index++;
			}

			if (left < right && top < bottom) {
				for (int i = right - 1; i > left; i--) {
					res[bottom][i] = index++;
				}
				for (int i = bottom; i > top; i--) {
					res[i][left] = index++;
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
