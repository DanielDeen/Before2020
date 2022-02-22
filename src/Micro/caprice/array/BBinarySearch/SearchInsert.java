package Micro.caprice.array.BBinarySearch;

/**
 * @program Before2020
 * @description: 35. 搜索插入位置
 * @author: ding
 * @create: 2022/02/22 22:56
 */
public class SearchInsert {
	public static void main(String[] args) {
		System.out.println(new SearchInsert().searchInsert(
				new int[]{1, 3, 5, 6}, 0));
	}

	public int searchInsert(int[] nums, int target) {
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
		return left;
	}
}
