package Micro.caprice.backtracking.ESubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 78.子集
 * @author: ding
 * @create: 2022/05/08 23:45
 */
public class SubSets {
	public static void main(String[] args) {
		System.out.println(new SubSets().subsets(new int[]{1, 2, 3}));
	}


	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtracking(nums, list, new LinkedList<>(), 0);
		return list;
	}

	private void backtracking(int[] nums, List<List<Integer>> list, LinkedList<Integer> tmp, int index) {
		list.add(new ArrayList<>(tmp));
		if (index >= nums.length) {
			return;
		}

		for (int i = index; i < nums.length; i++) {
			tmp.add(nums[i]);
			backtracking(nums, list, tmp, ++index);
			tmp.removeLast();
		}
	}
}
