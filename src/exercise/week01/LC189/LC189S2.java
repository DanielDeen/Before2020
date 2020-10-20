package exercise.week01.LC189;

import java.util.Arrays;

/**
 * @description: 旋转数组
 * @author: Daniel Deen
 * @create: 2020-10-21 00:09
 */

public class LC189S2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 2;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0 , nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;

        }
    }
}
