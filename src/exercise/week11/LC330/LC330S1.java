package exercise.week11.LC330;

/**
 * @description: 330.按要求补齐数组
 * @author: Daniel Deen
 * @create: 2020-12-29 23:42
 */

public class LC330S1 {
    public int minPatches(int[] nums, int n) {
        int res = 0, len = nums.length, index = 0;
        int x = 1;
        while (x <= n) {
            if (index < len && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                x *= 2;
                res++;
            }
        }

        return res;
    }
}
