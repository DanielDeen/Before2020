package exercise.week15.LC51;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 51.N皇后
 * @author: Daniel Deen
 * @create: 2021-01-27 01:32
 */

public class LC51S1 {
    public List<List<String>> solveNQueens(int n) {
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        List<List<String>> ans = new ArrayList<>();
        solve(ans, queens, n, 0, 0, 0, 0);
        return ans;
    }

    private void solve(List<List<String>> ans, int[] queens, int n,
                       int row, int columns, int diagonal1, int diagonal2) {
        if (row == n) {
            List<String> board = generateBoard(queens, n);
            ans.add(board);
        } else {
            int availablePositions = ((1 << n) - 1) & (~(columns | diagonal1 | diagonal2));
            while (availablePositions != 0) {
                int position = availablePositions & (-availablePositions);
                availablePositions = availablePositions & (availablePositions - 1);
                int column = Integer.bitCount(position - 1);
                queens[row] = column;
                solve(ans, queens, n, row + 1, columns | position,
                        (diagonal1 | position) << 1, (diagonal2 | position) >> 1);
                queens[row] = -1;
            }
        }
    }

    private List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
