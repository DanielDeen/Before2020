package Micro.caprice.binarytree.HBalancedBinaryTree;

/**
 * @program Before2020
 * @description: 110. 平衡二叉树
 * @author: ding
 * @create: 2022/03/27 23:17
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);

		return Math.abs(leftDepth - rightDepth) <= 1;
	}

	private int getDepth(TreeNode node) {
		int depth = 0;
		while (node != null) {
			node = node.left;
			depth++;
		}
		return depth;
	}
}
