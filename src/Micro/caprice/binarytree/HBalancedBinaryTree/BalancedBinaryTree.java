package Micro.caprice.binarytree.HBalancedBinaryTree;

/**
 * @program Before2020
 * @description: 110. 平衡二叉树
 * @author: ding
 * @create: 2022/03/27 23:17
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		return getDepth(root) != -1;
	}

	// 递归法
	private int getDepth(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftDepth = getDepth(node.left);
		if (leftDepth == -1) {
			return -1;
		}

		int rightDepth = getDepth(node.right);
		if (rightDepth == -1) {
			return -1;
		}


		if (Math.abs(leftDepth - rightDepth) > 1) {
			return -1;
		}

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
