package Micro.caprice.binarytree.JSumOfLeftLeaf;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 513. 找树左下角的值
 * @author: ding
 * @create: 2022/03/30 00:48
 */
public class BottomLeftTreeValue {

	// 迭代
	public int findBottomLeftValue(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int res = 0;
		while (!queue.isEmpty()) {
			res = queue.peek().val;
			int len = queue.size();
			while (len > 0) {
				TreeNode tmpNode = queue.poll();
				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				len--;
			}
		}
		return res;
	}


	// 递归

	int maxDepth = 0;
	int leftValue = 0;

	public int findBottomLeftValue1(TreeNode root) {
		if (root == null) {
			return 0;
		}
		leftValue = root.val;
		traversal(root, 0);
		return leftValue;
	}

	private void traversal(TreeNode node, int depth) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (maxDepth < depth) {
				maxDepth = depth;
				leftValue = node.val;
			}
		}

		if (node.left != null) {
			traversal(node.left, depth + 1);
		}
		if (node.right != null) {
			traversal(node.right, depth + 1);
		}
	}

}
