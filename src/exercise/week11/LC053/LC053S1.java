package exercise.week11.LC053;

import java.util.Arrays;

/**
 * @description: 53.最大子序和
 * @author: Daniel Deen
 * @create: 2020-12-30 01:23
 */

public class LC053S1 {
    public static void main(String[] args) {
        System.out.println(new LC053S1().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] >= 0) dp[i] = dp[i - 1] + nums[i];
            else dp[i] = nums[i];
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    public int maxSubArray1(int[] nums) {
        int pre = 0, res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            res = Math.max(res, pre);
        }
        return res;
    }
}
