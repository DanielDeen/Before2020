package exercise.week12.LC399;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 399.除数求值
 * @author: Daniel Deen
 * @create: 2021-01-06 00:39
 */

public class LC399S1 {
    /**
     * 并查集
     * makeSet(s): 建立一个新的并查集，其中包含s个单元素集合
     * unionSet(x,y): 把元素x和元素y所在的集合合并，要求 x 和 y 所在的集合不相交，如果相交就不合并
     * find(x): 找到元素 x 所在的集合的代表，该操作也可以用于判断两个元素是否位于同一个集合，只要将它们
     * 各自的代表比较一下就可以
     */
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationsSize = equations.size();
        UnionFind unionFind = new UnionFind(equationsSize * 2);

        Map<String, Integer> hashMap = new HashMap<>(equationsSize * 2);
        int index = 0;
        for (int i = 0; i < equationsSize; i++) {
            List<String> equation = equations.get(i);
            String s1 = equation.get(0);
            String s2 = equation.get(1);
            if (!hashMap.containsKey(s1)) {
                hashMap.put(s1, index);
                index++;
            }
            if (!hashMap.containsKey(s2)) {
                hashMap.put(s2, index);
                index++;
            }

            unionFind.union(hashMap.get(s1), hashMap.get(s2), values[i]);
        }

        int queriesSize = queries.size();
        double[] res = new double[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            String s1 = queries.get(i).get(0);
            String s2 = queries.get(i).get(1);

            Integer index1 = hashMap.get(s1);
            Integer index2 = hashMap.get(s2);

            if (index1 == null || index2 == null) {
                res[i] = -1.0d;
            } else {
                res[i] = unionFind.isConnected(index1, index2);
            }
        }
        return res;
    }

    private class UnionFind {
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

        public void union(int x, int y, double value) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
            weight[rootX] = weight[y] * value / weight[x];

        }

        public int find(int x) {
            if (x != parent[x]) {
                int origin = parent[x];
                parent[x] = find(parent[x]);
                weight[x] *= weight[origin];
            }
            return parent[x];
        }

        public double isConnected(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return weight[x] / weight[y];
            } else {
                return -1.0d;
            }
        }
    }
}
