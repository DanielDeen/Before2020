package exercise.week09.LC015;

import exercise.week01.LC024.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 15.三数之和
 * @author: Daniel Deen
 * @create: 2020-12-19 00:42
 */

public class LC015S1 {

    public static void main(String[] args) {
        System.out.println(new LC015S1().threeSum(new int[]{0,0,0,0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0, n = nums.length; i < n - 2; i++) {
            if (nums[i] > 0) return res;
            if (i > 1 && nums[i] == nums[i - 1]) continue;
            int first = i + 1;
            int last = n - 1;
            while (first < last) {
                int sum = nums[i] + nums[first] + nums[last];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[first], nums[last]));
                    while (first < last && nums[first] == nums[++first]) ;
                    while (first < last && nums[last] == nums[--last]) ;
                } else if (sum < 0) {
                    while (first < last && nums[first] == nums[++first]) ;
                } else {
                    while (first < last && nums[last] == nums[--last]) ;
                }
            }
        }
        return res;
    }
}
