package Micro.caprice.array.EMatrix;

import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 54.螺旋矩阵
 * @author: ding
 * @create: 2022/02/22 22:03
 */
public class SpiralOrder {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		new SpiralOrder().spiralOrder(matrix).forEach(System.out::println);
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new LinkedList<>();

		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;

		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			for (int i = top + 1; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			if (left < right && top < bottom) {
				for (int i = right - 1; i > left; i--) {
					list.add(matrix[bottom][i]);
				}
				for (int i = bottom; i > top; i--) {
					list.add(matrix[i][left]);
				}
			}

			left++;
			right--;
			top++;
			bottom--;
		}

		return list;
	}
}
