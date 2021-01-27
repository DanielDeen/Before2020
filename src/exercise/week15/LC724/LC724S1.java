package exercise.week15.LC724;

import java.util.Arrays;

/**
 * @description: 724.寻找数组的中心索引
 * @author: Daniel Deen
 * @create: 2021-01-28 00:05
 */

public class LC724S1 {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2*sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
