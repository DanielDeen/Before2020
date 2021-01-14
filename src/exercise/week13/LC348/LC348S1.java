package exercise.week13.LC348;

/**
 * @description: 348.判定井字棋胜负
 * @author: Daniel Deen
 * @create: 2021-01-12 01:02
 */

public class LC348S1 {

    public static void main(String[] args) {
        int t = 0;

        System.out.println(++t == 1);
    }


    int[] rows, cols, dig;
    int n;

    public LC348S1(int n) {
        rows = new int[n];
        cols = new int[n];
        dig = new int[2];

        this.n = n;
    }

    public int move(int row, int col, int player) {
        return ((player == 1 &&
                rows[row]++ == n - 1 |
                        cols[col]++ == n - 1 |
                        (row == col && dig[0]++ == n - 1) |
                        (row + col == n - 1 && dig[1]++ == n - 1))

                || (player == 2 &&
                rows[row]-- == 1 - n |
                        cols[col]-- == 1 - n |
                        (row == col && dig[0]-- == 1 - n) |
                        (row + col == n - 1 && dig[1]-- == 1 - n)))
                ? player : 0;
    }
}
