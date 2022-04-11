package Micro.caprice.binarytree.PCommonAncester;

/**
 * @program Before2020
 * @description: 235. 二叉搜索树的最近公共祖先
 * @author: ding
 * @create: 2022/04/10 23:51
 */
public class CommonAncestorInBST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == q || root == p) {
			return root;
		}

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);


		if (left == null) {
			return right;
		}

		if (right == null) {
			return left;
		}

		return root;
	}



	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {

	}
}
