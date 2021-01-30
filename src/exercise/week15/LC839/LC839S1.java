package exercise.week15.LC839;

/**
 * @description: 839.相似字符串组
 * @author: Daniel Deen
 * @create: 2021-01-31 02:07
 */

public class LC839S1 {
    public int numSimilarGroups(String[] strs) {
        int len = strs.length;
        UnionFind uf = new UnionFind(len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (uf.isConnected(i, j)) {
                    continue;
                }

                if (checkSame(strs[i], strs[j])) {
                    uf.union(i, j);
                }
            }
        }
        return uf.size;
    }

    public boolean checkSame(String w1, String w2) {
        if (w1.equals(w2)) return true;
        int res = 0;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                res++;
                if (res > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    class UnionFind {
        int[] parent;
        int size;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.size = n;
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
            size--;
        }
    }
}
