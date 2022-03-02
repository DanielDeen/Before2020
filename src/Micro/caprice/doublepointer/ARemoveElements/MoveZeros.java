package Micro.caprice.doublepointer.ARemoveElements;

/**
 * @program Before2020
 * @description: 283. 移动零
 * @author: ding
 * @create: 2022/03/02 01:53
 */
public class MoveZeros {
	public static void main(String[] args) {
		new MoveZeros().moveZeroes(new int[]{0, 1, 0, 3, 12});
	}

	public void moveZeroes(int[] nums) {
		int slow = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[slow++] = nums[i];
			}
		}

		for (int i = slow; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
