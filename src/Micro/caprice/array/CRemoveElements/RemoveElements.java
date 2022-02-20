package Micro.caprice.array.CRemoveElements;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 27.移除元素
 * @author: ding
 * @create: 2022/02/20 21:00
 */
public class RemoveElements {

	public static void main(String[] args) {
		int[] nums = {3, 2, 2, 3};
		System.out.println(new RemoveElements().remove(nums, 3));
		Arrays.stream(nums).forEach(System.out::println);
	}

	public int remove(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			if (nums[right] == target && left < right) {
				right--;
			}
			if (nums[left] == target && nums[right] != target) {
				int tmp = nums[right];
				nums[right] = tmp;
				nums[left] = tmp;
				left++;
				right--;
				continue;
			}

			if (nums[left] != target) {
				left++;
				continue;
			}

		}
		return left;
	}


	public int fastMove(int[] nums, int target) {
		int slow = 0;
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != target ) {
				nums[slow++] = nums[fast];
			}
		}
		return slow;
	}
}
