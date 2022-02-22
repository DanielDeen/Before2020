package Micro.caprice.array.BBinarySearch;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 34. 在排序数组中查找元素的第一个和最后一个位置
 * @author: ding
 * @create: 2022/02/22 23:14
 */
public class SearchRange {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new SearchRange().searchRange(new int[]{1}, 1)));
	}

	public int[] searchRange(int[] nums, int target) {
		int start = findTarget(nums, target, false);
		int end = findTarget(nums, target, true);
		return new int[]{start, end};
	}

	public int findTarget(int[] nums, int target, boolean isEnd) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + ((right - left) >> 1);
			if (nums[mid] == target && isEnd) {
				while (mid + 1 < nums.length && nums[mid + 1] == target) {
					mid++;
				}
				return mid;
			}


			if (nums[mid] == target && !isEnd) {
				while (mid - 1 >= 0 && nums[mid - 1] == target) {
					mid--;
				}
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
