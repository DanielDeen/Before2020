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


	List<Integer> res;
	int count;
	int maxCount;

	TreeNode pre;

	public int[] findMode1(TreeNode root) {
		res = new ArrayList<>();
		maxCount = 0;
		count = 0;
		pre = null;

		traversal(root);

		int[] re = new int[res.size()];
		for (int i = 0; i < re.length; i++) {
			re[i] = res.get(i);
		}
		return re;

	}


	private void traversal(TreeNode root) {
		if (root == null) {
			return;
		}


		traversal(root.left);

		int rootValue = root.val;
		if (pre == null || rootValue != pre.val) {
			count = 1;
		} else {
			count++;
		}

		if (count > maxCount) {
			res.clear();
			res.add(rootValue);
			maxCount = count;
		} else if (count == maxCount) {
			res.add(rootValue);
		}

		pre = root;

		traversal(root.right);
	}


	public int[] findMode2(TreeNode root) {
		TreeNode pre = null;
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();

		int maxCount = 0;
		int count = 0;

		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else{
				cur = stack.pop();
				if (pre == null || cur.val != pre.val) {
					count = 1;
				} else {
					count++;
				}

				if (count > maxCount) {
					result.clear();
					result.add(cur.val);
					maxCount = count;
				} else if (count == maxCount) {
					result.add(cur.val);
				}

				pre = cur;
				cur = cur.right;
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
