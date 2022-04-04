package Micro.caprice.binarytree.OSearchTree;

/**
 * @program Before2020
 * @description: 98. 验证二叉搜索树
 * @author: ding
 * @create: 2022/04/04 00:03
 */
public class IsValidBST {
	TreeNode max;
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}

		boolean left = isValidBST(root.left);
		if (!left) {
			return  false;
		}

		if (max != null && root.val <= max.val) {
			return false;
		}

		max = root;
		boolean right = isValidBST(root.right);
		return right;
	}
}
