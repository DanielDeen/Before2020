package exercise.week08.LC200;

/**
 * @description: 200.岛屿数量
 * @author: Daniel Deen
 * @create: 2020-12-08 00:32
 */

public class LC200SS1 {
    class UnionFind {
        int count;
        int[] parent;
        int[] rank;

        public UnionFind(char[][] grid) {
            count = 0;
            int m = grid.length;
            int n = grid[0].length;
            parent = new int[m * n];
            rank = new int[m * n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        parent[i * n + j] = i * n + j;
                        count++;
                    }

                    rank[i * n + j] = 0;
                }
            }
        }

        void union(int i, int j) {
            int iSet = find(i);
            int jSet = find(j);

            if (iSet != jSet) {
                if (rank[iSet] > rank[jSet]) {
                    parent[jSet] = iSet;
                } else if (rank[iSet] < rank[jSet]) {
                    parent[iSet] = jSet;
                } else {
                    parent[jSet] = iSet;
                    rank[iSet] += 1;
                }
                count--;
            }
        }

        int find(int index) {
            if (parent[index] != index) parent[index] = find(parent[index]);
            return parent[index];
        }

        int getCount() {
            return count;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        UnionFind uf = new UnionFind(grid);

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    if (i - 1 >= 0 && grid[i - 1][j] == '1') {
                        uf.union(i * nc + j, (i - 1) * nc + j);
                    }
                    if (i + 1 < nr && grid[i + 1][j] == '1') {
                        uf.union(i * nc + j, (i + 1) * nc + j);
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == '1') {
                        uf.union(i * nc + j, i * nc + j - 1);
                    }
                    if (j + 1 < nc && grid[i - 1][j] == '1') {
                        uf.union(i * nc + j, i * nc + j + 1);
                    }
                }
            }
        }
        return uf.getCount();

    }
}
