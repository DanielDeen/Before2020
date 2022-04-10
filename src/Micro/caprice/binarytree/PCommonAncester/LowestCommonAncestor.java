package Micro.caprice.binarytree.PCommonAncester;

/**
 * @program Before2020
 * @description: 236.二叉树的最近公共祖先
 * @author: ding
 * @create: 2022/04/09 15:15
 */
public class LowestCommonAncestor {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == q || root == p || root == null) {
			return root;
		}


		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		}

		if (left == null && right != null) {
			return right;
		} else if (left != null && right == null) {
			return left;
		}
		return null;
	}
}
