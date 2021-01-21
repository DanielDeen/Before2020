package exercise.week13.LC628;

import java.util.Arrays;

/**
 * @description: 628.三个数的最大乘积
 * @author: Daniel Deen
 * @create: 2021-01-20 23:32
 */

public class LC628S1 {
    public int maximumProduct(int[] nums) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[n], nums[n - 2] * nums[n - 1] * nums[n]);
    }
}
