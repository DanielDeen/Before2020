package exercise.week01.LC015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 三数之和
 * @author: Daniel Deen
 * @create: 2020-10-23 23:46
 */

public class LC015S1 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int pre = i + 1;
            int end = nums.length - 1;
            while (pre < end) {
                int sum = nums[i] + nums[pre] + nums[end];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[pre], nums[end]));
                    while (pre < end && nums[pre] == nums[pre + 1]) pre++;
                    while (pre < end && nums[end] == nums[end - 1]) end--;

                    pre++;
                    end--;
                } else if (sum < 0) {
                    pre++;
                } else {
                    end--;
                }
            }

        }
        return res;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int pre = i + 1;
            int end = nums.length - 1;
            while (pre < end) {
                int sum = nums[i] + nums[pre] + nums[end];
                if (sum < 0) {
                    while (pre<end && nums[pre] == nums[++pre]);
                } else if (sum > 0) {
                    while (pre < end && nums[end] == nums[--end]);
                } else {
                    res.add(Arrays.asList(nums[i], nums[pre], nums[end]));
                    while (pre<end && nums[pre] == nums[++pre]);
                    while (pre < end && nums[end] == nums[--end]);
                }
            }
        }
        return res;
    }
}
