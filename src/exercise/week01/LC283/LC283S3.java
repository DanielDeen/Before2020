package exercise.week01.LC283;

import java.util.Arrays;

/**
 * @description: 移动零
 * @author: Daniel Deen
 * @create: 2020-10-24 23:19
 */

public class LC283S3 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        if (nums.length <= 0) return;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index<i){
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
}
