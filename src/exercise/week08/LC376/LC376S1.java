package exercise.week08.LC376;

/**
 * @description: 376.摆动序列
 * @author: Daniel Deen
 * @create: 2020-12-12 01:52
 */

public class LC376S1 {
    public int wiggleMaxLength(int[] nums) {
        int up = 1, down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return nums.length == 0 ? 0 : Math.max(up, down);
    }
}
