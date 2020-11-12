package exercise.week03.LC046;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 全排列
 * @author: Daniel Deen
 * @create: 2020-11-08 23:24
 */

public class LC046S1 {
    public static void main(String[] args) {
        System.out.println(new LC046S1().permute(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
