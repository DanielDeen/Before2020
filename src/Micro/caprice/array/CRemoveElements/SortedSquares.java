package Micro.caprice.array.CRemoveElements;

/**
 * @program Before2020
 * @description: 977.有序数组的平方
 * @author: ding
 * @create: 2022/02/20 23:04
 */
public class SortedSquares {
	public static void main(String[] args) {
		int[] nums = {1};
		int[] res = new SortedSquares().sortedSquares(nums);
		for (int num : res) {
			System.out.println(num);
		}
	}

	public int[] sortedSquares(int[] nums) {
		int[] res = new int[nums.length];

		int left = 0;
		int right = nums.length - 1;
		int index = right;
		while (left <= right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				res[index--] = nums[left] * nums[left++];
			} else {
				res[index--] = nums[right] * nums[right--];
			}
		}

		return res;
	}
}
