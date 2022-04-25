package Micro.caprice.backtracking.BCombinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program Before2020
 * @description: 77. 组合
 * @author: ding
 * @create: 2022/04/25 23:29
 */
public class Combine {
	public static void main(String[] args) {
		System.out.println(new Combine().combine(4, 2));
	}


	List<List<Integer>> ans;
	public List<List<Integer>> combine(int n, int k) {
		ans = new ArrayList<>();
		backtracking(new LinkedList<>(), n, k, 1);
		return ans;
	}

	private void backtracking(LinkedList<Integer> tmp, int n, int k, int flag) {
		if (tmp.size() == k) {
			ans.add(new ArrayList<>(tmp));
			return;
		}

		for (int i = flag; i <= n; i++) {
			tmp.add(i);
			backtracking(tmp, n, k, ++flag);
			tmp.removeLast();
		}
	}


}
