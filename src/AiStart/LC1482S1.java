package AiStart;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 1482.制作m束花所需的最少天数
 * @author: ding
 * @create: 2021/05/09 10:08
 */
public class LC1482S1 {
	public static void main(String[] args) {
		System.out.println(new LC1482S1().minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3));
	}


	public int minDays(int[] bloomDay, int m, int k) {
		int sumF = m * k;
		int n = bloomDay.length;
		if (n < sumF) {
			return -1;
		}
		int max = Arrays.stream(bloomDay).max().getAsInt();
		int min = 1;
		while (min < max) {
			int mid = (min + max) >> 1;
			if (canMake(bloomDay, mid, m, k)) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		return max;
	}

	private boolean canMake(int[] bloomDay, int days, int m, int k) {
		int sum = 0, flowers = 0;
		for (int i = 0; i < bloomDay.length && sum < m; i++) {
			if (bloomDay[i] <= days) {
				flowers++;
				if (flowers == k) {
					flowers = 0;
					sum++;
				}
			} else {
				flowers = 0;
			}
		}
		return sum >= m;
	}
}
