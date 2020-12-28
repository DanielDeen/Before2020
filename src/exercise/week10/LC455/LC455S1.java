package exercise.week10.LC455;

import java.util.Arrays;

/**
 * @description: 455.分发饼干
 * @author: Daniel Deen
 * @create: 2020-12-25 00:51
 */

public class LC455S1 {
    public static void main(String[] args) {
        System.out.println(new LC455S1().findContentChildren(new int[]{1, 2},
                new int[]{1, 2, 3}));
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length - 1;
        int n = s.length - 1;
        int res = 0;
        while (m >= 0 && n >= 0) {
            if (s[n] >= g[m]) {
                m--;
                n--;
                res++;
            } else {
                m--;
            }
        }
        return res;
    }
}
