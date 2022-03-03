package Micro.caprice.doublepointer.ARemoveElements;

/**
 * @program Before2020
 * @description: 977.有序数组的平方
 * @author: ding
 * @create: 2022/03/03 00:38
 */
public class SortSquares {
	public static void main(String[] args) {

	}

	public int[] sortedSquares(int[] nums) {
		int[] res = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;
		int index = nums.length - 1;
		while (left <= right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				res[index--] = nums[left] * nums[left];
				left++;
			} else {
				res[index--] = nums[right] * nums[right];
				right--;
			}
		}

		return res;
	}
}
