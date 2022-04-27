package Micro.caprice.backtracking.BCombinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 216. 组合总和 III
 * @author: ding
 * @create: 2022/04/27 22:15
 */
public class CombineII {
	List<List<Integer>> res;

	public List<List<Integer>> combinationSum3(int k, int n) {
		res = new ArrayList<>();
		backtracking(new LinkedList<>(), k, n, 1);
		return res;
	}

	private void backtracking(LinkedList<Integer> tmp, int k, int n, int startIndex) {
		if (getSum(tmp) > n || (tmp.size() > k)) {
			return;
		}
		if ((getSum(tmp) == n) && (tmp.size() == k)) {
			res.add(new ArrayList<>(tmp));
			return;
		}

		for (int i = startIndex; i <= 9; i++) {
			tmp.add(startIndex);
			backtracking(tmp, k, n, ++startIndex);
			tmp.removeLast();
		}
	}

	private int getSum(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}

		return sum;
	}
}
