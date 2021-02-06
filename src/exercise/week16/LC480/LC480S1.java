package exercise.week16.LC480;

import java.util.Arrays;

/**
 * @description: 480.滑动窗口中位数
 * @author: Daniel Deen
 * @create: 2021-02-03 23:13
 */

public class LC480S1 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int cnt = len - k + 1;

        double[] res = new double[cnt];
        int[] t = new int[k];

        for (int left = 0, right = left + k - 1; right < len; left++, right++) {
            for (int i = left; i <= right; i++) {
                t[i - left] = nums[i];
            }

            Arrays.sort(t);
            res[left] = (t[k / 2] / 2.0) + (t[(k - 1) / 2] / 2.0);
        }
        return res;
    }
}
