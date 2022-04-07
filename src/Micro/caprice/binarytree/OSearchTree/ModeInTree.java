package Micro.caprice.binarytree.OSearchTree;

import java.util.*;

/**
 * @program Before2020
 * @description: 501. 二叉搜索树中的众数
 * @author: ding
 * @create: 2022/04/06 23:12
 */
public class ModeInTree {
	public int[] findMode(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<>();
		traversal(root, map);
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list, (v1, v2) -> v2 - v1);
		int MaxNode = list.get(0);
		List<Integer> list1 = new ArrayList<>();
		for (Integer k : map.keySet()) {
			if (map.get(k) == MaxNode) {
				list1.add(k);
			}
		}

		int[] res = new int[list1.size()];
		for (int i = 0; i < list1.size(); i++) {
			res[i] = list1.get(i);
		}
		return res;
	}

	private void traversal(TreeNode node, Map<Integer, Integer> map) {
		if (node == null) {
			return;
		}
		map.put(node.val, map.getOrDefault(node.val, 0) + 1);
		traversal(node.left, map);
		traversal(node.right, map);
	}

}
