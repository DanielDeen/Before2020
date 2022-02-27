package Micro.caprice.hash.HThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 15.三数之和
 * @author: ding
 * @create: 2022/02/27 21:34
 */
public class ThreeSum {
	public static void main(String[] args) {
		System.out.println(new ThreeSum().threeSum1(new int[]{-1, 0, 1, 2, -1, -4}));
	}

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3) {
			return new ArrayList<>();
		}

		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				int k = j + 1;
				while (k < nums.length) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						res.add(list);
					}
					k++;
				}
			}
		}

		return res;
	}


	public List<List<Integer>> threeSum1(int[] nums) {
		if (nums.length < 3) {
			return new ArrayList<>();
		}

		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0) {
				return res;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = nums.length - 1;
			while (right > left) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum > 0) {
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					res.add(Arrays.asList(nums[i], nums[right], nums[left]));

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
		return res;
	}
}
