package exercise.bigExercise.Day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 15.三数之和
 * @author: Daniel Deen
 * @create: 2020-11-26 00:52
 */

public class LC015 {

    public static void main(String[] args) {
        System.out.println(new LC015().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int target = nums[i] + nums[start] + nums[end];
                if (target == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[++start]) ;
                    while (start < end && nums[end] == nums[--end]) ;
                } else if (target < 0) {
                    start++;
                } else {
                    end--;
                }
            }

        }

        return res;
    }
}
