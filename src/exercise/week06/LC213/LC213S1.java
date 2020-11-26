package exercise.week06.LC213;

/**
 * @description: 213.打家劫舍II
 * @author: Daniel Deen
 * @create: 2020-11-25 22:52
 */

public class LC213S1 {
    public static void main(String[] args) {
        System.out.println(new LC213S1().rob(new int[]{1, 3, 1, 3, 100}));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robPath(nums, 0, nums.length - 2),
                robPath(nums, 1, nums.length - 1));
    }

    private int robPath(int[] nums, int in, int out) {
        int preRob = 0;
        int preNotRob = 0;
        int rob = 0;
        int notRob = 0;
        for (int i = in; i <= out; i++) {
            rob = preNotRob + nums[i];
            notRob = Math.max(preNotRob, preRob);

            preNotRob = notRob;
            preRob = rob;
        }

        return Math.max(rob, notRob);
    }
}
