package exercise.week10.LC046;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 46.全排列
 * @author: Daniel Deen
 * @create: 2020-12-25 00:23
 */

public class LC046S1 {

    public static void main(String[] args) {
        System.out.println(new LC046S1().permute(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) return res;

        boolean[] used = new boolean[nums.length];

        List<Integer> path = new ArrayList<>();

        dfs(nums, nums.length, 0, path, used, res);

        return res;
    }

    private void dfs(int[] nums, int length, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, length, depth + 1, path, used, res);

                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
