package exercise.week15.LC1631;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

/**
 * @description: 1631.最小体力消耗路径
 * @author: Daniel Deen
 * @create: 2021-01-29 01:08
 */

public class LC1631S1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

    public int minimumEffortPath(int[][] heights) {

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int rowLen = heights.length;
        int colLen = heights[0].length;

        int left = 0, right = 99999, res = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0});
            boolean[] seen = new boolean[rowLen * colLen];
            seen[0] = true;
            while (!queue.isEmpty()) {
                int[] cell = queue.poll();
                int x = cell[0], y = cell[1];
                for (int i = 0; i < 4; i++) {
                    int mx = x + dirs[i][0];
                    int my = y + dirs[i][1];

                    if (mx >= 0 && mx < rowLen && my >= 0 && my < colLen && !seen[mx * colLen + my]
                            && Math.abs(heights[x][y] - heights[mx][my]) <= mid) {
                        queue.offer(new int[]{mx, my});
                        seen[mx * colLen + my] = true;
                    }
                }
            }

            if (seen[rowLen * colLen - 1]) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return res;
    }

    public int minimumEffortPath1(int[][] heights) {
        int rowLen = heights.length;
        int colLen = heights[0].length;
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                int index = i * colLen + j;
                if (i > 0) edges.add(new int[]{index - colLen, index, Math.abs(heights[i][j] - heights[i - 1][j])});
                if (j > 0) edges.add(new int[]{index - 1, index, Math.abs(heights[i][j] - heights[i][j - 1])});
            }
        }

        Collections.sort(edges, Comparator.comparingInt(o -> o[2]));
        UnionFind uf = new UnionFind(rowLen * colLen);
        int ans = 0;
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1], v = edge[2];
            uf.union(x, y);
            if (uf.isConnected(0, rowLen * colLen - 1)) {
                ans = v;
                break;
            }
        }

        return ans;
    }

    class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            return parent[x] == x ? x : (parent[x] = find(parent[x]));
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return false;
            parent[rootX] = rootY;
            return true;
        }

        public boolean isConnected(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            return rootX == rootY;
        }
    }
}
