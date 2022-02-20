package Micro.caprice.array.CRemoveElements;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 283.移动零
 * @author: ding
 * @create: 2022/02/20 22:08
 */
public class RemoveZeros {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		new RemoveZeros().removeZero(nums);
		Arrays.stream(nums).forEach(System.out::println);
	}

	public void removeZero(int[] nums) {
		int slow = -1;
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != 0) {
				nums[++slow] = nums[fast];
			}
		}
		for (int i = slow + 1; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
