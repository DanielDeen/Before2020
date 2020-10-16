package LeetCodeRode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 两数之和
 * @author: Daniel Deen
 * @create: 2020-08-19 23:42
 */

public class LC001 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 4;

        Arrays.stream(twoSum(nums,target)).forEach(System.out :: println);
    }

    static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            int com = target - nums[i];
            if (map.containsKey(com)){
                return new int[]{map.get(com),i};
            }
            map.put(nums[i],i);
        }
throw new IllegalArgumentException("No two sum solution");
    }
}
