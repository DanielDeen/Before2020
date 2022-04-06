package Micro.caprice.binarytree.OSearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 530. 二叉搜索树的最小绝对差
 * @author: ding
 * @create: 2022/04/06 21:20
 */
public class MinAbsoluteDiff {
	public int getMinimumDifference(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traversal(root, list);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < list.size(); i++) {
			if ((list.get(i) - list.get(i - 1)) < min) {
				min = list.get(i) - list.get(i - 1);
			}
		}
		return min;
	}

	private void traversal(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}

		traversal(root.left, list);
		list.add(root.val);
		traversal(root.right, list);
	}


	TreeNode pre;
	public int getMinimumDifference1(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Stack<TreeNode> stack = new Stack<>();
		int min = Integer.MAX_VALUE;
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				cur = stack.pop();
				if (pre != null) {
					min = Math.min(min, cur.val - pre.val);
				}

				pre = cur;
				cur = cur.right;
			}
		}
		return min;
	}
}
