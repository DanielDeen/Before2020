package Micro.caprice.stackANDqueue.GMaxSlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program Before2020
 * @description: 239. 滑动窗口最大值
 * @author: ding
 * @create: 2022/03/06 00:09
 */
public class MaxSlidingWindow {
	public static void main(String[] args) {

	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 1) {
			return nums;
		}

		MyselfQueue queue = new MyselfQueue();
		for (int i = 0; i < k; i++) {
			queue.add(nums[i]);
		}

		int len = nums.length - k + 1;
		int[] res = new int[len];
		int index = 0;
		res[index++] = queue.peek();
		for (int i = k; i < nums.length; i++) {
			queue.poll(nums[i - k]);
			queue.add(nums[i]);

			res[index++] = queue.peek();
		}

		return res;
	}
}

class MyselfQueue {
	Deque<Integer> deque = new LinkedList<>();

	void poll(int val) {
		if (!deque.isEmpty() && val == deque.peek()) {
			deque.poll();
		}
	}

	void add(int val) {
		while (!deque.isEmpty() && val > deque.getLast()) {
			deque.removeLast();
		}
		deque.add(val);
	}

	int peek() {
		return deque.peek();
	}
}
