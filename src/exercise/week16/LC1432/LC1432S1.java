package exercise.week16.LC1432;

import java.util.Arrays;

/**
 * @description: 1432.可获得的最大点数
 * @author: Daniel Deen
 * @create: 2021-02-06 23:04
 */

/**
 * 时间复杂度  O(n)
 * 空间复杂度  O(1)
 */

public class LC1432S1 {
    public int maxScore(int[] cardPoints, int k) {
        int curCount = 0;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < k; i++) {
            curCount += cardPoints[i];
        }
        maxCount = curCount;
        if (k == cardPoints.length) return maxCount;
        int n = cardPoints.length;
        while (index > 0) {
            curCount -= cardPoints[index];
            curCount += cardPoints[--n];
            if (curCount > maxCount) {
                maxCount = curCount;
            }
        }
        return maxCount;
    }
}
