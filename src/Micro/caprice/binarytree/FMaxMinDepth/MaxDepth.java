package Micro.caprice.binarytree.FMaxMinDepth;

/**
 * @program Before2020
 * @description: 104. 二叉树的最大深度
 * @author: ding
 * @create: 2022/03/27 01:11
 */
public class MaxDepth {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);


		return Math.max(leftDepth, rightDepth) + 1;
	}
}
