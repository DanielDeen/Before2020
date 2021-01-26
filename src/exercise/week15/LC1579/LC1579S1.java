package exercise.week15.LC1579;

import java.util.Arrays;

/**
 * @description: 1579.保证图可完全遍历
 * @author: Daniel Deen
 * @create: 2021-01-27 00:12
 */

public class LC1579S1 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind uf1 = new UnionFind(n);
        UnionFind uf2 = new UnionFind(n);
        int ans = 0;

        for (int[] edge : edges) {
            --edge[1];
            --edge[2];
        }

        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (!uf1.union(edge[1], edge[2])) {
                    ++ans;
                } else {
                    uf2.union(edge[1], edge[2]);
                }
            }
        }

        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (!uf1.union(edge[1], edge[2])) {
                    ++ans;
                }
            } else if (edge[0] == 2) {
                if (!uf2.union(edge[1], edge[2])) {
                    ++ans;
                }
            }
        }
        if (uf1.setCount != 1 || uf2.setCount != 1) {
            return -1;
        }
        return ans;
    }

    class UnionFind {
        int[] parent;
        int[] size;
        int n;

        int setCount;

        public UnionFind(int n) {
            this.n = n;
            this.setCount = n;
            this.parent = new int[n];
            this.size = new int[n];

            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int findSet(int x) {
            return parent[x] == x ? x : (parent[x] = findSet(parent[x]));
        }

        public boolean union(int x, int y) {
            int rootX = findSet(x);
            int rootY = findSet(y);

            if (rootX == rootY) {
                return false;
            }

            if (size[rootX] < size[rootY]) {
                int temp = rootY;
                rootY = rootX;
                rootX = temp;
            }

            parent[rootY] = rootX;
            size[rootX] += size[rootY];

            --setCount;
            return true;
        }

        public boolean isConnection(int x, int y) {
            int rootX = findSet(x);
            int rootY = findSet(y);

            return rootX == rootY;
        }
    }
}
