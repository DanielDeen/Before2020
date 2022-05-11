package Micro.caprice.backtracking.ESubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 90.子集II
 * @author: ding
 * @create: 2022/05/11 23:51
 */
public class SubsetsII {
	public static void main(String[] args) {
		System.out.println(new SubsetsII().subsetsWithDup(new int[]{1, 2, 2}));
	}


	List<List<Integer>> list = new ArrayList<>();

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		backtracking(nums, new ArrayList<>(), 0);
		return list;
	}

	private void backtracking(int[] nums, ArrayList<Integer> tmp, int index) {
		if (index == nums.length) {
			return;
		}

		list.add(new ArrayList<>(tmp));
		for (int i = index; i < nums.length; i++) {
			if (index < i && nums[i] == nums[i - 1]) {
				continue;
			}
			tmp.add(nums[i]);
			backtracking(nums, tmp, i + 1);
			tmp.remove(tmp.size() - 1);
		}
	}
}
