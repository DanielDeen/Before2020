package exercise.week03.LC015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 三数之和
 * @author: Daniel Deen
 * @create: 2020-11-07 23:35
 */

public class LC015SS1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return res;
            if (i > 1 && nums[i] == nums[i - 1]) continue;
            int pre = i + 1;
            int end = nums.length - 1;
            while (pre < end) {
                int sum = nums[i] + nums[pre] + nums[end];
                if (sum > 0) end--;
                if (sum < 0) pre++;
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[pre], nums[end]));
                    while (pre < end && nums[pre] == nums[pre + 1]) pre++;
                    while (pre < end && nums[end] == nums[end + 1]) end--;
                    pre++;
                    end--;
                }
            }
        }
        return res;
    }
}
