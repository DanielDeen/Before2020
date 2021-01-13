package exercise.week13.LC684;

/**
 * @description: 684.冗余连接
 * @author: Daniel Deen
 * @create: 2021-01-13 22:08
 */

public class LC684S1 {
    public int[] findRedundantConnection(int[][] edges) {
        int count = edges.length;
        int[] parent = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < count; i++) {
            int[] edge = edges[i];
            int x = edge[0], y = edge[1];
            if (find(parent, x) != find(parent, y)) {
                union(parent, x, y);
            } else {
                return edge;
            }
        }
        return new int[0];
    }

    public void union(int[] parent, int x, int y) {
        parent[find(parent, x)] = find(parent, y);
    }

    public int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }

        return parent[x];
    }


    public int[] findRedundantConnection1(int[][] edges) {
        int len = edges.length - 1;
        while (len >= 0) {
            boolean[] visited = new boolean[edges.length];
            int[][] newEdges = new int[edges.length - 1][];
            for (int i = 0; i < len; i++) {
                if (i == len) continue;
                newEdges[i] = edges[i];
            }
            dfs(newEdges, visited);
            if (isAllVisited(visited)) {
                return edges[len];
            }
        }
        return null;
    }

    private void dfs(int[][] edges, boolean[] visited) {
        int start = edges[0][0];
        int end = edges[0][1];
        visited[start] = true;
        visited[end] = true;


    }

    private boolean isAllVisited(boolean[] visited) {
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }

}
