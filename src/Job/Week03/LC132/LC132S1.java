package Job.Week03.LC132;

import java.util.Arrays;

/**
 * @description: 132.分割回文串II
 * @author: Daniel Deen
 * @create: 2021-03-08 21:27
 */

public class LC132S1 {

    public static void main(String[] args) {
        System.out.println(new LC132S1().minCut("aab"));
    }

    public int minCut(String s) {
        int len = s.length();
        boolean[][] flag = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(flag[i], true);
        }

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                flag[i][j] = s.charAt(i) == s.charAt(j) && flag[i + 1][j - 1];
            }
        }

        int[] res = new int[len];
        Arrays.fill(res, Integer.MAX_VALUE);
        for (int i = 0; i < len; i++) {
            if (flag[0][i]) {
                res[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (flag[j + 1][i]) {
                        res[i] = Math.min(res[i], res[j] + 1);
                    }
                }
            }
        }
        return res[len - 1];
    }
}
