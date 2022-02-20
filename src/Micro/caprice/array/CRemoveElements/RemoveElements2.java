package Micro.caprice.array.CRemoveElements;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 26.删除有序数组中的重复项
 * @author: ding
 * @create: 2022/02/20 21:34
 */
public class RemoveElements2 {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 2};
		System.out.println(new RemoveElements2().removeElements(nums));
		Arrays.stream(nums).forEach(System.out::println);
	}

	public int removeElements(int[] nums) {
		int slow = 0;
		for (int fast = 1; fast < nums.length; fast++) {
			if (nums[slow] != nums[fast]) {
				nums[++slow] = nums[fast];
			}
		}
		return slow;
	}
}
