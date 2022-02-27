package Micro.caprice.hash.IFourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 18.四数之和
 * @author: ding
 * @create: 2022/02/27 22:30
 */
public class FourSum {
	public static void main(String[] args) {

	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		if (nums.length < 4) {
			return new ArrayList<>();
		}

		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (nums[j] == nums[j - 1]) {
					continue;
				}

				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum > target) {
						right--;
					} else if (sum < target) {
						left++;
					} else {
						res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

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
