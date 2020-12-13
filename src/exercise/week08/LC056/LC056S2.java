package exercise.week08.LC056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description: 56.合并区间
 * @author: Daniel Deen
 * @create: 2020-12-14 00:44
 */

public class LC056S2 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));

        List<int[]> res = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            int index = i+1;
            if (intervals[i][1] > intervals[index][0]) intervals[index][0] = intervals[i][0];
            if (intervals[i][1] > intervals[index][1]) intervals[index][1] = intervals[i][1];
            intervals[i] = null;


        }

        return res.toArray(new int[res.size()][]);
    }
}
