package Micro.caprice.hash.CTwoListIntersection;

import java.util.*;

/**
 * @program Before2020
 * @description: 349. 两个数组的交集
 * @author: ding
 * @create: 2022/02/26 23:49
 */
public class Intersection {
	public static void main(String[] args) {

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		for (int n : nums1) {
			set1.add(n);
		}
		Set<Integer> set2 = new HashSet<>();
		for (int n : nums2) {
			if (set1.contains(n)) {
				set2.add(n);
			}
		}
		int[] ans = new int[set2.size()];
		int index = 0;
		for (int s : set2) {
			ans[index++] = s;
		}

		return ans;
	}

	public int[] intersection1(int[] nums1, int[] nums2) {
		boolean[] visited = new boolean[1000];
//		for (int i = 0; i < 1000; i++) {
//			visited[i] = true;
//		}

		List<Integer> list = new ArrayList<>();

		Arrays.stream(nums1).forEach(n -> visited[n] = true);
		Arrays.stream(nums2).forEach(n -> {
			if (visited[n]) {
				list.add(n);
				visited[n] = false;
			}
		});
		int[] ans = new int[list.size()];
		int index = 0;
		for (int s : list) {
			ans[index++] = s;
		}

		return list.stream().mapToInt(i->i).toArray();
	}
}
