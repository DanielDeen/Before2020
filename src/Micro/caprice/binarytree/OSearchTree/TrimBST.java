package Micro.caprice.binarytree.OSearchTree;

/**
 * @program Before2020
 * @description: 669. 修剪二叉搜索树
 * @author: ding
 * @create: 2022/04/18 23:27
 */
public class TrimBST {
	public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root == null) {
			return root;
		}

		if (root.val < low) {
			return trimBST(root.right, low, high);
		}

		if (root.val > high) {
			return trimBST(root.left, low, high);
		}

		root.left = trimBST(root.left, low, high);
		root.right = trimBST(root.right, low, high);
		return root;
	}
}
