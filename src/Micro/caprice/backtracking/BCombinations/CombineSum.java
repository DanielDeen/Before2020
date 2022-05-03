package Micro.caprice.backtracking.BCombinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 39. 组合总和
 * @author: ding
 * @create: 2022/05/03 21:36
 */
public class CombineSum {
	public static void main(String[] args) {
		System.out.println(new CombineSum().combinationSum(new int[]{2, 3, 5}, 8));
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(candidates);
		backtracking(candidates, target, res, new LinkedList<>(), 0, 0);
		return res;
	}

	private void backtracking(int[] candidates, int target, List<List<Integer>> res, LinkedList<Integer> list, int sum, int startIndex) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			res.add(new ArrayList<>(list));
			return;
		}

		for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
			sum += candidates[i];
			list.add(candidates[i]);
			backtracking(candidates, target, res, list, sum, startIndex++);
			list.removeLast();
			sum -= candidates[i];
		}
	}
}
