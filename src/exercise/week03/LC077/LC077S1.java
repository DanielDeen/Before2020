package exercise.week03.LC077;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 组合
 * @author: Daniel Deen
 * @create: 2020-11-08 23:06
 */

public class LC077S1 {
    public static void main(String[] args) {
        System.out.println(new LC077S1().combine(4, 2));
    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combineRes(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private void combineRes(List<List<Integer>> res, ArrayList<Integer> temp, int start, int n, int k) {
        if (k == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            combineRes(res, temp, i + 1, n, k - 1);
            temp.remove(temp.size() - 1);
        }
    }
}
