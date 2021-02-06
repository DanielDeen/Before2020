package exercise.week16.LC643;

import java.util.Arrays;

/**
 * @description: 643.子数组最大平均数I
 * @author: Daniel Deen
 * @create: 2021-02-04 23:04
 */

public class LC643S1 {
    public static void main(String[] args) {
        System.out.println(new LC643S1().findMaxAverage(new int[]{-1}, 1));
    }


    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        int nowSum = maxSum;
        int index = 0;
        for (int i = k; i < len; i++) {
            nowSum = nowSum + nums[i] - nums[index];
            maxSum = Math.max(nowSum, maxSum);
            index++;
        }
        return maxSum * 1.0 / k;
    }
}
