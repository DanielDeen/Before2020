package Micro.caprice.hash.CTwoListIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program Before2020
 * @description: 350.两个数组的交集 II
 * @author: ding
 * @create: 2022/02/27 00:16
 */
public class Intersection2 {
	public static void main(String[] args) {

	}

	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map1 = new HashMap();
		for (int n : nums1) {
			map1.put(n, map1.getOrDefault(n, 0) + 1);
		}

		List<Integer> list = new ArrayList<>();
		for (int n : nums2) {
			if (map1.containsKey(n) && map1.get(n) > 0) {
				list.add(n);
				map1.put(n, map1.get(n) - 1);
			}
		}

		int[] ans = new int[list.size()];
		int index = 0;
		for (int n : list) {
			ans[index++] = n;
		}
		return ans;
	}

}
