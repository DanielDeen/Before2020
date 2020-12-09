package exercise.week08.LC547;

import java.util.Arrays;

/**
 * @description: 547.朋友圈
 * @author: Daniel Deen
 * @create: 2020-12-08 00:13
 */

public class LC547SS1 {
    public int findCircleNum(int[][] M) {
        int[] parent = new int[M.length];
        Arrays.fill(parent, -1);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] == 1 && i != j) {
                    union(parent, i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1) count++;
        }

        return count;
    }

    private void union(int[] parent, int i, int j) {
        int iSet = find(parent, i);
        int jSet = find(parent, j);

        if (iSet != jSet) parent[iSet] = jSet;
    }

    private int find(int[] parent, int i) {
        if (parent[i] == -1) return i;
        return find(parent, parent[i]);
    }
}
