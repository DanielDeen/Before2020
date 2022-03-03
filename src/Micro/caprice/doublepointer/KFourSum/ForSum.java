package Micro.caprice.doublepointer.KFourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 18. 四数之和
 * @author: ding
 * @create: 2022/03/04 00:53
 */
public class ForSum {
	public static void main(String[] args) {
		System.out.println(new ForSum().fourSum(new int[]{2, 2, 2, 2, 2}, 8));
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		if (nums.length < 4) {
			return new ArrayList<>();
		}

		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 1 && nums[i] == nums[i - 1]) {
				continue;
			}

			for (int j = nums.length - 1; j > 2; j--) {
				if ((j < nums.length - 1) && nums[j] == nums[j + 1]) {
					continue;
				}
				int left = i + 1;
				int right = j - 1;
				while (left < right) {
					int val = nums[i] + nums[left] + nums[right] + nums[j];
					if (val > target) {
						right--;
					} else if (val < target) {
						left++;
					} else {
						res.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}
						left++;
						right--;
					}
				}
			}
		}
		return res;
	}
}
