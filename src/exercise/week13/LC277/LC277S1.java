package exercise.week13.LC277;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 277.搜索名人
 * @author: Daniel Deen
 * @create: 2021-01-15 01:22
 */

public class LC277S1 {
    public int findCelebrity(int n) {
        int[][] p = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = knows(i, j) ? 1 : 0;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int res = Arrays.stream(p[i]).sum();
            if (res == 1) list.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int l : list) {
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += p[l][i];
            }
            if (res == n) result.add(l);
        }

        return result.size() == 1 ? result.get(0) : -1;
    }

    public boolean knows(int a, int b) {
        return true;
    }
}
