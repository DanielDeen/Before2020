package exercise.week01.LC283;

import java.util.Arrays;

/**
 * @description: 移动零
 * @author: Daniel Deen
 * @create: 2020-10-31 01:03
 */

public class LC283S4 {
    public static void main(String[] args) {
        int[] nums = {2, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index < i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
}
