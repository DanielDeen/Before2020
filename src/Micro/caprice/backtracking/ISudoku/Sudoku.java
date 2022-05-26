package Micro.caprice.backtracking.ISudoku;

/**
 * @program Before2020
 * @description: 37. 解数独
 * @author: ding
 * @create: 2022/05/26 01:42
 */
public class Sudoku {
	public void solveSudoku(char[][] board) {
		backtracking(board);
	}

	private boolean backtracking(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.') {
					continue;
				}

				for (char k = '1'; k <= '9'; k++) {
					if (isValid(i, j, k, board)) {
						board[i][j] = k;
						if (backtracking(board)) {
							return true;
						}
						board[i][j] = '.';
					}
				}
				return false;
			}
		}
		return true;
	}

	private boolean isValid(int row, int col, char value, char[][] board) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == value) {
				return false;
			}
		}


		for (int i = 0; i < 9; i++) {
			if (board[i][col] == value) {
				return false;
			}
		}

		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}
