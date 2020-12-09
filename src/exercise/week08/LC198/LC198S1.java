package exercise.week08.LC198;

/**
 * @description: 198.打家劫舍
 * @author: Daniel Deen
 * @create: 2020-12-10 00:44
 */

public class LC198S1 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 0; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }

    public int rob001(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int num : nums) {
            int temp = second;
            second = Math.max(first + num, second);
            first = temp;
        }

        return second;
    }
}
