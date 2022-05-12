package Micro.caprice.backtracking.FPermute;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 46.全排列
 * @author: ding
 * @create: 2022/05/12 23:46
 */
public class Permute {
	public static void main(String[] args) {
		System.out.println(new Permute().permute(new int[]{1, 2, 3}));
	}


	List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> permute(int[] nums) {
		backtracking(nums, new ArrayList<>());
		return res;
	}

	private void backtracking(int[] nums, ArrayList<Integer> list) {
		if (list.size() == nums.length) {
			res.add(new ArrayList<>(list));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				continue;
			}

			list.add(nums[i]);
			backtracking(nums, list);
			list.remove(list.size() - 1);
		}
	}
}
