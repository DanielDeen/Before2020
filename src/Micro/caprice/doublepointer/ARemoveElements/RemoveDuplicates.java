package Micro.caprice.doublepointer.ARemoveElements;

/**
 * @program Before2020
 * @description: 26. 删除有序数组中的重复项
 * @author: ding
 * @create: 2022/03/02 01:26
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}

	public int removeDuplicates(int[] nums) {
		int slow = 0;
		int fast = 0;
		while (fast < nums.length) {
			while (fast < nums.length && nums[slow] == nums[fast]) {
				fast++;
			}
			if (fast < nums.length) {
				nums[++slow] = nums[fast];
			}
		}

		return slow + 1;
	}
}
