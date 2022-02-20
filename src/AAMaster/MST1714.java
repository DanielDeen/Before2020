package AAMaster;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program Before2020
 * @description: 面试题17.14 最小K个数
 * @author: ding
 * @create: 2021/09/03 08:31
 */
public class MST1714 {
	public int[] smallestK(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int num : arr) {
			minHeap.offer(num);
		}

		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = minHeap.poll();
		}

		return res;

	}
}
