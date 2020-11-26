package exercise.bigExercise.Day02;

import java.awt.event.ItemEvent;
import java.util.Arrays;

/**
 * @description: 282.移动零
 * @author: Daniel Deen
 * @create: 2020-11-26 00:33
 */

public class LC282 {
    public static void main(String[] args) {
        int[] test = {1};
        new LC282().moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
    public void moveZeroes(int[] nums) {
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
