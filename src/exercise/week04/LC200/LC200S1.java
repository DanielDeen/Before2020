package exercise.week04.LC200;

/**
 * @description: 岛屿数量
 * @author: Daniel Deen
 * @create: 2020-11-13 23:05
 */

public class LC200S1 {
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int nr = grid.length;
        int nc = grid[0].length;
        for (int i = 0; i < nr; ++i) {
            for (int j = 0; j < nc; ++j) {
                if (grid[i][j] == '1') {
                    ++count;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}
