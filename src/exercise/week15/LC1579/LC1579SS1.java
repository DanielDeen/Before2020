package exercise.week15.LC1579;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description: 1579.深度方法
 * @author: Daniel Deen
 * @create: 2021-01-27 00:42
 */

public class LC1579SS1 {
    ArrayList<Integer>[][] mapEdge;
    int count;
    boolean[] visited;

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        mapEdge = new ArrayList[3][n + 1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n + 1; j++) {
                mapEdge[i][j] = new ArrayList<>();
            }
        }

        for (int[] edge : edges) {
            mapEdge[edge[0] - 1][edge[1]].add(edge[2]);
            mapEdge[edge[0] - 1][edge[2]].add(edge[1]);
        }
        visited = new boolean[n + 1];
        count = 0;
        dfsVisted(1, 0);
        if (count < 0) {
            return -1;
        }
        Arrays.fill(visited, false);
        count = 0;
        dfsVisted(1,1);
        if (count < n) {
            return -1;
        }

        Arrays.fill(visited, false);
        int common = 0;
        for (int i = 0; i < n + 1; i++) {
            if (!visited[i]) {
                count = 0;
                dfsVisted(i, 2);
                common += count - 1;
            }
        }
        return edges.length - (n - 1 << 1) + common;
    }

    public void dfsVisted(int i, int additionType) {
        if (visited[i]) {
            return;
        }

        visited[i] = true;
        for (int child : mapEdge[2][i]) {
            if (count == visited.length) {
                return;
            }

            if (!visited[child]) {
                dfsVisted(child, additionType);
            }
        }

        if (additionType == 0 || additionType == 1) {
            for (int child : mapEdge[additionType][i]) {
                if (count == visited.length) {
                    return;
                }
                if (!visited[child]) {
                    dfsVisted(child, additionType);
                }
            }
        }
    }
}
