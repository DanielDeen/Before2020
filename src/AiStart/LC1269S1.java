package AiStart;

/**
 * @program Before2020
 * @description: 1269.停在原地的方案🌲
 * @author: ding
 * @create: 2021/05/14 01:06
 */
public class LC1269S1 {
	public int numWays(int steps, int arrLen) {
		int MODULO = 1000000007;
		int maxColumn = Math.min(arrLen - 1, steps);
		int[]dp = new int[maxColumn + 1];
		dp[0] = 1;
		for (int i = 1; i <= steps; i++) {
			int[] dpNext = new int[maxColumn+1];
			for (int j = 0; j <= maxColumn; j++) {
				dpNext[j] = dp[j];
				if (j - 1 >= 0) {
					dpNext[j] = (dpNext[j] + dp[j - 1]) % MODULO;
				}
				if (j + 1 <= maxColumn) {
					dpNext[j] = (dpNext[j] + dp[j + 1]) % MODULO;
				}
			}
			dp = dpNext;
		}
		return dp[0];
	}
}
