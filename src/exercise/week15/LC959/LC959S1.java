package exercise.week15.LC959;

/**
 * @description: 959.由斜杠划分区域
 * @author: Daniel Deen
 * @create: 2021-01-25 23:03
 */

public class LC959S1 {
    public int regionsBySlashes(String[] grid) {
        int len = grid.length;
        int size = 4 * len * len;

        UnionFind unionFind = new UnionFind(size);
        for (int i = 0; i < len; i++) {
            char[] row = grid[i].toCharArray();
            for (int j = 0; j < len; j++) {
                int index = 4 * (i * len + j);
                char c = row[j];
                if (c == '/') {
                    unionFind.union(index, index + 3);
                    unionFind.union(index + 1, index + 2);
                } else if (c == '\\') {
                    unionFind.union(index, index + 1);
                    unionFind.union(index + 2, index + 3);
                } else {
                    unionFind.union(index, index + 1);
                    unionFind.union(index + 1, index + 2);
                    unionFind.union(index + 2, index + 3);
                }

                if (j + 1 < len) {
                    unionFind.union(index + 1, 4 * (i * len + j + 1) + 3);
                }
                if (i + 1 < len) {
                    unionFind.union(index + 2, 4 * ((i + 1) * len + j));
                }
            }
        }
        return unionFind.getCount();
    }

    class UnionFind {
        int[] parent;
        int count;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.count = n;

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int getCount() {
            return count;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }

            parent[rootX] = rootY;
            count--;
        }

        public int find(int x) {

            return x == parent[x] ? x:find(parent[x]);
        }

    }
}
