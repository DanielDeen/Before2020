package Micro.caprice.greed.CWiggleSubsequence;

import java.util.Map;

/**
 * @program Before2020
 * @description: 376. 摆动序列
 * @author: ding
 * @create: 2022/05/28 00:41
 */
public class WiggleSubsequence {
	// 局部最优：删除单调坡度上的节点（不包括单调坡度两端的节点），那么这个坡度就可以有两个局部峰值
	// 整体最优：整个序列有最多的局部峰值，从而达到最长摆动序列
	public int wiggleMaxLength(int[] nums) {
		if (nums.length <= 1) {
			return nums.length;
		}

		int curDiff = 0;
		int preDiff = 0;

		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			curDiff = nums[i] - nums[i - 1];
			if ((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
				count++;
				preDiff = curDiff;
			}
		}
		return count;
	}

	// 动态规划
	public int wiggleMaxLength1(int[] nums) {
		int[][] dp = new int[nums.length][2];
		dp[0][0] = dp[0][1] = 1;

		for (int i = 1; i < nums.length; i++) {
			dp[i][0] = dp[i][1] = 1;

			for (int j = 0; j < i; j++) {
				if (nums[j] > nums[i]) {
					dp[i][1] = Math.max(dp[i][1], dp[i][1] + 1);
				}
				if (nums[j] < nums[i]) {
					dp[i][0] = Math.max(dp[i][0], dp[i][0] + 1);
				}
			}
		}
		return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
	}
}
