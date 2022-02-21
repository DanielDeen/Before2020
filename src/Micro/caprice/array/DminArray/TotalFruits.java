package Micro.caprice.array.DminArray;

import java.util.HashMap;
import java.util.Map;

/**
 * @program Before2020
 * @description: 904.水果成篮
 * @author: ding
 * @create: 2022/02/21 21:50
 */
public class TotalFruits {
	public static void main(String[] args) {
		int[] fruits = {1, 2, 3, 2, 2};
		System.out.println(new TotalFruits().totalFruits(fruits));
	}

	public int totalFruits(int[] tree) {
		int ans = 0;
		int index = 0;
		Map<Integer, Integer> keyMap = new HashMap<>(2);
		for (int i = 0; i < tree.length; i++) {
			keyMap.put(tree[i], keyMap.getOrDefault(tree[i], 0) + 1);
			while (keyMap.size() > 2) {
				keyMap.put(tree[index], keyMap.get(tree[index]) - 1);
				if (keyMap.get(tree[index]) == 0) {
					keyMap.remove(tree[index]);
				}
				index++;
			}
			ans = Math.max(ans, i - index + 1);
		}
		return ans;
	}

	public int totalFruit(int[] tree) {
		int ans = 0;

		int left = 0;
		int right = 0;
		int lf = tree[left];
		int rf = tree[right];
		while (right < tree.length) {
			if (tree[right] == lf || tree[right] == rf) {
				ans = Math.max(ans, right - left + 1);
				right++;
			} else {
				left = right - 1;
				lf = tree[left];
				while (left > 0 && tree[left - 1] == lf) {
					left--;
				}
				rf = tree[right];
				ans = Math.max(ans, right - left + 1);
			}
		}
		return ans;
	}

}
