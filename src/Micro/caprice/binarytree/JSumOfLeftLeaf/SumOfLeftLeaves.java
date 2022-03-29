package Micro.caprice.binarytree.JSumOfLeftLeaf;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 404. 左叶子之和
 * @author: ding
 * @create: 2022/03/30 00:19
 */
public class SumOfLeftLeaves {
	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftValue = sumOfLeftLeaves(root.left);
		int rightValue = sumOfLeftLeaves(root.right);

		int midValue = 0;
		if (root.left != null && root.left.left == null && root.left.right == null) {
			midValue += root.left.val;
		}

		return midValue + leftValue + rightValue;
	}

	public int sumOfLeftLeaves1(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int sum = 0;
		while (!queue.isEmpty()) {
			TreeNode tmpNode = queue.poll();
			if (tmpNode.left != null && tmpNode.left.left == null && tmpNode.left.right == null) {
				sum+=tmpNode.left.val;
			}

			if (tmpNode.left != null) {
				queue.offer(tmpNode.left);
			}
			if (tmpNode.right != null) {
				queue.offer(tmpNode.right);
			}
		}
		return sum;
	}
}
