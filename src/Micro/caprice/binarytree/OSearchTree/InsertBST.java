package Micro.caprice.binarytree.OSearchTree;

/**
 * @program Before2020
 * @description: 701. 二叉搜索树中的插入操作
 * @author: ding
 * @create: 2022/04/11 23:10
 */
public class InsertBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}

		if (val > root.val) {
			root.right = insertIntoBST(root.right, val);
		}

		if (val < root.val) {
			root.left = insertIntoBST(root.left, val);
		}
		return root;
	}
}
