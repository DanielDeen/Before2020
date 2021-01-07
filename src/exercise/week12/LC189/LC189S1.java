package exercise.week12.LC189;

import java.util.Arrays;

/**
 * @description: 189.旋转数组
 * @author: Daniel Deen
 * @create: 2021-01-08 00:22
 */

public class LC189S1 {
    public void rotate(int[] nums, int k) {
        int step = k % nums.length;
        if (step == 0) return;
        int[] newNums = new int[nums.length];
        System.arraycopy(nums, nums.length - step, newNums, 0, step);
        System.arraycopy(nums, 0, newNums, step, nums.length - step);
        System.arraycopy(newNums, 0, nums, 0, nums.length);
    }
}
