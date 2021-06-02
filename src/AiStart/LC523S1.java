package AiStart;

import java.util.HashSet;
import java.util.Set;

/**
 * @program Before2020
 * @description: 523.连续的子数组和
 * @author: ding
 * @create: 2021/06/02 23:35
 */
public class LC523S1 {
	public static void main(String[] args) {
		System.out.println(new LC523S1().checkSubarraySum(
				new int[]{0,1,0,3,0,4,0,4,0}, 5
		));
	}

	public boolean checkSubarraySum(int[] nums, int k) {
		int n = nums.length;
		int[] sum = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + nums[i - 1];
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 2; i <= n; i++) {
			set.add(sum[i - 2] % k);
			if (set.contains(sum[i] % k)) {
				return true;
			}
		}
		return false;

	}
}
