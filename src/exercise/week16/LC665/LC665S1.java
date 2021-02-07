package exercise.week16.LC665;

/**
 * @description: 665.非递减数列
 * @author: Daniel Deen
 * @create: 2021-02-07 00:56
 */

public class LC665S1 {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (i == 1 || nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
                count++;
            }
        }
        return count <= 1;
    }
}
