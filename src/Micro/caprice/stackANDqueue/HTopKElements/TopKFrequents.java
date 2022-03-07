package Micro.caprice.stackANDqueue.HTopKElements;

import java.util.*;

/**
 * @program Before2020
 * @description: 347. 前 K 个高频元素
 * @author: ding
 * @create: 2022/03/07 01:07
 */
public class TopKFrequents {
	public static void main(String[] args) {

	}

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
		for (Map.Entry<Integer, Integer> entry : entries) {
			queue.offer(entry);
			if (queue.size() > k) {
				queue.poll();
			}
		}

		int[] res = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			res[i] = Objects.requireNonNull(queue.poll()).getKey();
		}

		return res;
	}

}
