package AAMaster;

/**
 * @program Before2020
 * @description: 704 二分查收
 * @author: ding
 * @create: 2021/09/06 23:30
 */
public class LC704 {
	public int search(int[] nums, int target) {
		int right = nums.length;
		int left = 0;
		while (right > left) {
			int mid = left + ((right - left) >> 1);
			int num = nums[mid];
			if (num == target) {
				return mid;
			}
			if (num > target) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
