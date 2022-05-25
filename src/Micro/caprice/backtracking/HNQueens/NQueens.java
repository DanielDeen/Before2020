package Micro.caprice.backtracking.HNQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 51.N皇后
 * @author: ding
 * @create: 2022/05/23 23:29
 */
public class NQueens {
	List<List<String>> res = new ArrayList<>();

	public List<List<String>> solveNQueens(int n) {
		char[][] chessboard = new char[n][n];
		for (char[] c : chessboard) {
			Arrays.fill(c, '.');
		}
		backtracking(n, 0, chessboard);
		return res;
	}

	private void backtracking(int n, int row, char[][] chessboard) {
		if (row == n) {
			res.add(Arrays2List(chessboard));
			return;
		}
		for (int col = 0; col < n; col++) {
			if (isValid(row, col, n, chessboard)) {
				chessboard[row][col] = 'Q';
				backtracking(n, row + 1, chessboard);
				chessboard[row][col] = '.';
			}
		}
	}

	private boolean isValid(int row, int col, int n, char[][] chessboard) {
		for (int i = 0; i < row; i++) {
			if (chessboard[i][col] == 'Q') {
				return false;
			}
		}

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chessboard[i][j] == 'Q') {
				return false;
			}
		}

		for (int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++) {
			if (chessboard[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}

	private List<String> Arrays2List(char[][] chessboard) {
		List<String> list = new ArrayList<>();

		for (char[] c : chessboard) {
			list.add(String.copyValueOf(c));
		}
		return list;
	}


	private void initRes(int n) {
		List<String> tmp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			tmp.add(".");
		}

		for (int i = 0; i < n; i++) {
			res.add(tmp);
		}
	}
}
