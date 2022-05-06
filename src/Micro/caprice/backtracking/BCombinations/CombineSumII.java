package Micro.caprice.backtracking.BCombinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 40. 组合总和 II
 * @author: ding
 * @create: 2022/05/03 22:52
 */
public class CombineSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		backtracking(candidates, target, list, new LinkedList<>(), 0, 0);
		return list;
	}

	private void backtracking(int[] candidates, int target, List<List<Integer>> res, LinkedList<Integer> list, int sum, int startIndex) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			res.add(new ArrayList<>(list));
			return;
		}

		for (int i = startIndex; i < candidates.length; i++) {
			if (i > startIndex && candidates[i] == candidates[i - 1]) {
				continue;
			}
			sum += candidates[i];
			list.add(candidates[i]);
			// startIndex 需要 替换为 i+1 !!!!!!!!!!!!!!
			backtracking(candidates, target, res, list, sum, i + 1);
			list.removeLast();
			sum -= candidates[i];
		}
	}
}
