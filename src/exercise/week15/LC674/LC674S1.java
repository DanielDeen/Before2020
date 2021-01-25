package exercise.week15.LC674;

import java.util.Arrays;

/**
 * @description: 674.最长连续递增序列
 * @author: Daniel Deen
 * @create: 2021-01-24 01:58
 */

public class LC674S1 {
    public static void main(String[] args) {
        System.out.println(new LC674S1().findLengthOfLCIS1(new int[]{1, 1, 1, 1, 1}));
    }


    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int tempIndex = 1;
            while (i + tempIndex < nums.length) {
                if (nums[i + tempIndex] > nums[i + tempIndex - 1]) {
                    tempIndex++;
                } else {
                    break;
                }
            }
            index = Math.max(index, tempIndex);
        }
        return index;
    }

    public int findLengthOfLCIS1(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] +1;
            } else {
                dp[i] = 1;
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
