package Micro.caprice.binarytree.ESymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 101. 对称二叉树
 * @author: ding
 * @create: 2022/03/24 00:00
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return compare(root.left, root.right);
	}

	private boolean compare(TreeNode left, TreeNode right) {
		if (left == null && right != null) {
			return false;
		} else if (left != null && right == null) {
			return false;
		} else if (left == null && right == null) {
			return true;
		} else if (left.val != right.val) {
			return false;
		} else {
			return compare(left.left, right.right) && compare(left.right, right.left);
		}
	}


	public boolean isSymmetric1(TreeNode root) {
		if (root == null) {
			return true;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root.left);
		queue.offer(root.right);
		while (!queue.isEmpty()) {
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();
			if (left == null && right == null) {
				continue;
			}

			if (left == null || right == null || (left.val != right.val)) {
				return false;
			}

			queue.offer(left.left);
			queue.offer(right.right);
			queue.offer(left.right);
			queue.offer(right.left);
		}
		return true;
	}
}
