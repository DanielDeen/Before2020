package exercise.week03.LC047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 全排序II
 * @author: Daniel Deen
 * @create: 2020-11-08 23:39
 */

public class LC047S1 {
    public static void main(String[] args) {
        System.out.println(new LC047S1().permuteUnique(new int[]{1, 1, 2}));
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(res, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
