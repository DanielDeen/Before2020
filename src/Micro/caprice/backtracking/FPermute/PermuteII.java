package Micro.caprice.backtracking.FPermute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 47.全排列 II
 * @author: ding
 * @create: 2022/05/12 23:53
 */
public class PermuteII {
	public static void main(String[] args) {
		System.out.println(new PermuteII().permuteUnique(new int[]{1, 1, 2}));
	}



	// 组合问题和排列问题是在树形结构的叶子节点收集结果，而子集问题就是去树上所有节点的结果
	List<List<Integer>> res = new ArrayList<>();
	int[] used = new int[20];

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		backtracking(nums, new ArrayList<>());
		return res;
	}

	private void backtracking(int[] nums, ArrayList<Integer> list) {
		if (list.size() == nums.length) {
			res.add(new ArrayList<>(list));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			// 树层对上一位进去去重
			if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 0) {
				continue;
			}
			if (used[i] == 0) {
				used[i] = 1;
				list.add(nums[i]);
				backtracking(nums, list);
				list.remove(list.size() - 1);
				used[i] = 0;
			}
		}
	}
}
