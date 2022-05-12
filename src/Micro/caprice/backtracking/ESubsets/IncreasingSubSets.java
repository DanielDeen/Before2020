package Micro.caprice.backtracking.ESubsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program Before2020
 * @description: 491. 递增子序列
 * @author: ding
 * @create: 2022/05/12 00:14
 */
public class IncreasingSubSets {
	public static void main(String[] args) {
		System.out.println(new IncreasingSubSets().findSubsequences(new int[]{4, 6, 7, 7}));
	}


	List<List<Integer>> ans = new ArrayList<>();

	public List<List<Integer>> findSubsequences(int[] nums) {
		backtracking(nums, new ArrayList<>(), 0);
		return ans;
	}

	public void backtracking(int[] nums, List<Integer> list, int index) {
		if (list.size() > 1) {
			ans.add(new ArrayList<>(list));
		}

		// 同一层，使用过的数字不能再被使用
		Map<Integer, Integer> map = new HashMap<>();

		// 使用数组 ！！！
		int[] used = new int[201];
		for (int i = index; i < nums.length; i++) {
			if (list.size() > 0 && (list.get(list.size() - 1) > nums[i])) {
				continue;
			}
			if (map.getOrDefault(nums[i], 0) >= 1) {
				continue;
			}
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

			if (used[nums[i] + 100] == 1) {
				continue;
			}
			used[nums[i] + 100] = 1;
			list.add(nums[i]);
			backtracking(nums, list, i + 1);
			list.remove(list.size() - 1);
		}

	}
}
