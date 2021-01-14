package exercise.week13.LC348;

/**
 * @description: 348.判定井字棋胜负
 * @author: Daniel Deen
 * @create: 2021-01-15 00:57
 */

public class LC348S2 {
    // if row==col means in the diagonal
    private int diagonal;
    // id col == size - row - 1 in the reverse diagonal
    private int reverseDiagonal;

    private int[] rows;
    private int[] cols;

    private int size;

    public LC348S2(int n) {
        this.rows = new int[n];
        this.cols = new int[n];
        this.size = n;
    }

    public int move(int row, int col, int player) {
        int toAdd = player == 1 ? 1 : -1;
        rows[row] += toAdd;
        cols[col] += toAdd;

        if (row == col) {
            diagonal += toAdd;
        }

        if (col == size - row - 1) {
            reverseDiagonal += toAdd;
        }

        if (Math.abs(rows[row]) == size || Math.abs(cols[col]) == size
                || Math.abs(diagonal) == size || Math.abs(reverseDiagonal) == size) {
            return player;
        }


        return 0;
    }
}
