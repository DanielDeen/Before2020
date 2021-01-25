package exercise.week15.LC1128;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 1128.等价多米诺骨牌对的数量
 * @author: Daniel Deen
 * @create: 2021-01-26 00:05
 */

public class LC1128S1 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        int[] num = new int[100];
        for (int[] domino : dominoes) {
            int val = Math.max(domino[1] * 10 + domino[0], domino[0] * 10 + domino[1]);
            res += num[val]++;
        }
        return res;
    }
}
