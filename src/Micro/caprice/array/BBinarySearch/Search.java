package Micro.caprice.array.BBinarySearch;

/**
 * @program Before2020
 * @description: 704.二分查找
 * @author: ding
 * @create: 2022/02/22 22:51
 */
public class Search {
	public static void main(String[] args) {
		System.out.println(new Search().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
	}

	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + ((right - left) >> 1);
			if (nums[mid] == target) {
				return mid;
			}

			if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
