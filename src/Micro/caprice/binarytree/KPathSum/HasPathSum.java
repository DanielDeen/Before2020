package Micro.caprice.binarytree.KPathSum;

import org.graalvm.compiler.api.replacements.Snippet;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 112. 路径总和
 * @author: ding
 * @create: 2022/03/30 01:39
 */
public class HasPathSum {
	boolean res = false;

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}
		sumPath(root, 0, targetSum);
		return res;
	}


	private void sumPath(TreeNode node, int sum, int targetSum) {
		if (node.left == null && node.right == null) {
			if (sum + node.val == targetSum) {
				res = true;
			}
		}

		if (node.left != null) {
			sumPath(node.left, sum + node.val, targetSum);
		}

		if (node.right != null) {
			sumPath(node.right, sum + node.val, targetSum);
		}
	}


	// 递归法
	private boolean traversal(TreeNode node, int count) {
		if (node.left == null && node.right == null && count == 0) {
			return true;
		}

		if (node.left != null && traversal(node.left, count - node.left.val)) {
			return true;
		}

		if (node.right != null && traversal(node.right, count - node.right.val)) {
			return true;
		}
		return false;
	}

	private boolean traversal0(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}

		Queue<TreeNode> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();
		queue1.offer(root);
		queue2.offer(root.val);
		while (!queue1.isEmpty()) {
			TreeNode tmpNode = queue1.poll();
			int tmpSum = queue2.poll();
			if (tmpNode.left == null && tmpNode.right == null && tmpSum == targetSum) {
				return true;
			}

			if (tmpNode.left != null) {
				queue1.offer(tmpNode.left);
				queue2.offer(tmpSum + tmpNode.left.val);
			}

			if (tmpNode.right != null) {
				queue1.offer(tmpNode.right);
				queue2.offer(tmpSum + tmpNode.right.val);
			}
		}

		return false;
	}
}
