package Micro.caprice.array.DminArray;

/**
 * @program Before2020
 * @description: 209.长度最小的子数组
 * @author: ding
 * @create: 2022/02/21 21:09
 */
public class MinSubArrayLen {
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		System.out.println(new MinSubArrayLen().findMinSubArrayLen(nums, 7));
	}

	/**
	 * 滑动窗口
	 * 窗口内是什么？
	 * 如何移动窗口的起始位置？
	 * 如何移动窗口的结束位置？
	 *
	 * 窗口就是 满足其和 >= s 的长度最小的连续子数组
	 * 窗口的起始位置如何移动： 如果当前窗口的值大于 s 了，窗口就要向前移动了
	 * 窗口的结束位置如何移动： 窗口的结束位置就是遍历数组的指针，窗口的起始位置设置
	 *      数组的为起始位置就可以了
	 *
	 */
	public int findMinSubArrayLen(int[] nums, int target) {
		int len = Integer.MAX_VALUE;
		int sum = 0;
		int start = 0;
		int subLength = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= target) {
				subLength = (i - start + 1);
				len = Math.min(len, subLength);
				sum -= nums[start++];
			}
		}
		return len == Integer.MAX_VALUE ? 0 : len;
	}
}
