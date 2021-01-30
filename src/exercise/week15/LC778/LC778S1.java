package exercise.week15.LC778;

/**
 * @description: 778.水位上升的泳池中游泳
 * @author: Daniel Deen
 * @create: 2021-01-30 00:01
 */

public class LC778S1 {
    public int swimInWater(int[][] grid) {
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int rcLen = grid.length;

        int len = rcLen * rcLen;
        int[] index = new int[len];

        for (int i = 0; i < rcLen; i++) {
            for (int j = 0; j < rcLen; j++) {
                index[grid[i][j]] = i * rcLen + j;
            }
        }

        UnionFind uf = new UnionFind(len);
        for (int i = 0; i < len; i++) {
            int x = index[i] / rcLen;
            int y = index[i] % rcLen;

            for (int[] dir : dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (newX >= 0 && newX < rcLen && newY >= 0 && newY < rcLen
                        && grid[newX][newY] <= i) {
                    uf.union(index[i], newX * rcLen + newY);
                }
                if (uf.isConnected(0, len - 1)) {
                    return i;
                }
            }
        }

        return -1;
    }

    class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public boolean isConnected(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            return rootX == rootY;
        }

        public int find(int x) {
            return parent[x] == x ? x : (parent[x] = find(parent[x]));
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
        }
    }
}
