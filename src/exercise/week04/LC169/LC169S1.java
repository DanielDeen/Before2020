package exercise.week04.LC169;

import java.util.Arrays;

/**
 * @description: 多数元素
 * @author: Daniel Deen
 * @create: 2020-11-15 23:03
 */

public class LC169S1 {
    public static void main(String[] args) {
        System.out.println(new LC169S1().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length)/2];
    }
}
