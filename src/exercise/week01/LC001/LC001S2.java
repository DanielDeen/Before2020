package exercise.week01.LC001;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description: 两数之和
 * @author: Daniel Deen
 * @create: 2020-10-23 00:35
 */

public class LC001S2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[1];
    }
}
