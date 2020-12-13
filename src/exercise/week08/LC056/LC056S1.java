package exercise.week08.LC056;

import java.util.*;

/**
 * @description: 56.合并区间
 * @author: Daniel Deen
 * @create: 2020-12-13 00:48
 */

public class LC056S1 {
    public static void main(String[] args) {
        System.out.println(new LC056S1().merge2(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0], right = intervals[i][1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < left) {
                res.add(new int[]{left, right});
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], right);
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public int[][] merge2(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return intervals;

        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][1] >= intervals[j][0] && intervals[i][0] <= intervals[j][1]) {
                    if (intervals[i][0] < intervals[j][0]) intervals[j][0] = intervals[i][0];
                    if (intervals[i][1] > intervals[j][1]) intervals[j][1] = intervals[i][1];
                    intervals[i] = null;
                    count++;
                    break;
                }
            }
        }
        int[][] ans = new int[intervals.length - count][];
        for (int i = 0, j = 0; j < intervals.length; j++) {
            if (intervals[j] != null) {
                ans[i++] = intervals[j];
            }
        }
        return ans;
    }
}
