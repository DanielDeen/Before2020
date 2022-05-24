package Micro.caprice.backtracking.HNQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program Before2020
 * @description: 51.N皇后
 * @author: ding
 * @create: 2022/05/23 23:29
 */
public class NQueens {
	List<List<String>> res = new ArrayList<>();

	public List<List<String>> solveNQueens(int n) {
		initRes(n);


		return res;
	}


	private void initRes(int n) {
		List<String> tmp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			tmp.add(".");
		}

		for (int i = 0; i < n; i++) {
			res.add(tmp);
		}
	}
}
