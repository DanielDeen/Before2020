package exercise.week08.LC547;

/**
 * @description: 547.朋友圈
 * @author: Daniel Deen
 * @create: 2020-12-07 23:30
 */

public class LC547S1 {

    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] m, int[] visited, int i) {
        for (int j = 0; j < m[0].length; j++) {
            if (m[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(m, visited, j);
            }
        }
    }
}
