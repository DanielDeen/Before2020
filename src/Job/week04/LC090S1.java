package Job.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 90.子集II
 * @author: Daniel Deen
 * @create: 2021-03-31 00:58
 */

public class LC090S1 {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return res;
    }

    private void dfs(boolean flag, int cur, int[] nums) {
        if (nums.length == cur) {
            res.add(new ArrayList<>(list));
            return;
        }
        dfs(false, cur + 1, nums);
        if (!flag && cur > 0 && nums[cur - 1] == nums[cur]) {
            return;
        }
        list.add(nums[cur]);
        dfs(true, cur + 1, nums);
        list.remove(list.size() - 1);
    }
}
