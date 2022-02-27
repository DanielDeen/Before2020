package Micro.caprice.hash.ETwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @program Before2020
 * @description: 1.两数之和
 * @author: ding
 * @create: 2022/02/27 20:37
 */
public class TwoSum {
	public static void main(String[] args) {

	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp)) {
				return new int[]{map.get(temp), i};
			}
			map.put(nums[i], i);
		}
		return new int[]{-1, -1};
	}

}
