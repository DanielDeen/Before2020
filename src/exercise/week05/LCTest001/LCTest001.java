package exercise.week05.LCTest001;

import java.util.*;

/**
 * @description: 寻找 target
 * @author: Daniel Deen
 * @create: 2020-11-22 13:20
 */

public class LCTest001 {
    public static void main(String[] args) {
        System.out.println(new LCTest001().fourSum(new int[]{0, 0, 0, 0, 0}, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        if (nums.length < 4) return new ArrayList<>(res);
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = nums.length - 1; j > 2; j--) {
                int index = nums[i] + nums[j];
                int pre = i + 1;
                int end = j - 1;
                while (pre < end) {
                    int sum = index + nums[pre] + nums[end];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[pre], nums[end], nums[j]));
                        while (pre < end && nums[pre] == nums[++pre]) ;
                        while (pre < end && nums[end] == nums[--end]) ;
                    } else if (sum > target) {
                        while (pre < end && nums[end] == nums[--end]) ;
                    } else {
                        while (pre < end && nums[pre] == nums[++pre]) ;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
