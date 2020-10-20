package exercise.week01.LC026;

import java.util.Arrays;

/**
 * @description: 删除数组中的重复项
 * @author: Daniel Deen
 * @create: 2020-10-20 23:59
 */

public class LC026S2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int res = 0;
        int point = 1;
        while (point < nums.length) {
            if (nums[res] != nums[point]) {
                res++;
                nums[res] = nums[point];
            }
            point++;
        }

        return res + 1;

    }
}
