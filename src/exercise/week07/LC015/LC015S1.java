package exercise.week07.LC015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 15.三数之和
 * @author: Daniel Deen
 * @create: 2020-12-05 00:39
 */

public class LC015S1 {
    public static void main(String[] args) {
        System.out.println(new LC015S1().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int pre = i + 1;
            int end = nums.length - 1;

            while (pre < end) {
                int target = nums[i] + nums[pre] + nums[end];
                if (target == 0) {
                    res.add(Arrays.asList(nums[i], nums[pre], nums[end]));
                    while (pre < end && nums[pre] == nums[++pre]) ;
                    while (pre < end && nums[end] == nums[--end]) ;
                } else if (target > 0) {
                    while (pre < end && nums[end] == nums[--end]) ;
                } else {
                    while (pre < end && nums[pre] == nums[++pre]) ;
                }
            }
        }
        return res;
    }
}
