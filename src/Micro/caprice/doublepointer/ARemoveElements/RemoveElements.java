package Micro.caprice.doublepointer.ARemoveElements;

/**
 * @program Before2020
 * @description: 27. 移除元素
 * @author: ding
 * @create: 2022/03/02 01:10
 */
public class RemoveElements {
	public static void main(String[] args) {
	}

	public int removeElement(int[] nums, int val) {
		int slow = 0;
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != val) {
				nums[slow++] = nums[fast];
			}
		}

		return slow;
	}
}
