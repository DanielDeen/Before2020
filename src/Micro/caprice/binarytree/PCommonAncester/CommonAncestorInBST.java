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
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		}
		if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}
		return root;
	}


	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		while (true) {
			if (root.val > p.val && root.val > q.val) {
				root = root.left;
			} else if (root.val < p.val && root.val < q.val) {
				root = root.right;
			} else {
				break;
			}
		}
		return root;
	}
}
