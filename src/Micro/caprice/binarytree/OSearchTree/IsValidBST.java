package Micro.caprice.binarytree.OSearchTree;

import java.util.ArrayList;
import java.util.List;

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

	List<Integer> list;
	private void traversal(TreeNode root) {
		if (root == null) {
			return;
		}
		traversal(root.left);
		list.add(root.val);
		traversal(root.right);
	}
	public boolean isValidBST1(TreeNode root) {
		list = new ArrayList<>();
		traversal(root);
		for (int i = 1 ; i < list.size(); i++) {
			// 主要要小于等于，搜索树里不能有相同元素
			if (list.get(i) <= list.get(i-1)) {
				return false;
			}
		}
		return true;
	}
}
