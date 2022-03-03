package Micro.caprice.doublepointer.JThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 15. 三数之和
 * @author: ding
 * @create: 2022/03/04 00:29
 */
public class ThreeSum {
	public static void main(String[] args) {
		System.out.println(new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}));
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums.length < 3) {
			return res;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0) {
				return res;
			}

			if ((i > 0 && nums[i] == nums[i - 1])) {
				continue;
			}

			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int target = nums[i] + nums[left] + nums[right];
				if (target > 0) {
					right--;

				} else if (target < 0) {
					left++;
				} else {
					res.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}
					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					left++;
					right--;
				}
			}

		}
		return res;
	}
}
