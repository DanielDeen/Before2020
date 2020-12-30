package exercise.week11.LC435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: 435.无重叠区间
 * @author: Daniel Deen
 * @create: 2020-12-31 00:08
 */

public class LC435S1 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int len = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 0; i < len; i++) {
            if (intervals[i][0] >= right) {
                ans++;
                right = intervals[i][1];
            }
        }

        return len - ans;
    }
}
