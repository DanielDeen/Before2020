package exercise.week12.LC399;

import java.util.List;

/**
 * @description: 399.除数求值
 * @author: Daniel Deen
 * @create: 2021-01-08 00:59
 */

public class LC399S2 {
//    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
//
//    }

    class UnionFind {
        private int[] parent;
        private double[] weight;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.weight = new double[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                weight[i] = 1.0d;
            }
        }

        public void union(int x, int y, int[] parent) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }

            parent[rootX] = rootY;
        }

        public int find(int x) {
            if (x != parent[x]) {
                int origin = parent[x];
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public double isConnect(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return weight[x] / weight[y];
            }
            return -1.0d;
        }
    }
}
