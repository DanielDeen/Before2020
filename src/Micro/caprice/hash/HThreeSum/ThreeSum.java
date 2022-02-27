package Micro.caprice.hash.HThreeSum;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 15.三数之和
 * @author: ding
 * @create: 2022/02/27 21:34
 */
public class ThreeSum {
	public static void main(String[] args) {

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
}
