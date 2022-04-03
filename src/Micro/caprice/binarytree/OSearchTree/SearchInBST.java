package Micro.caprice.binarytree.OSearchTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 700. 二叉搜索树中的搜索
 * @author: ding
 * @create: 2022/04/03 23:42
 */
public class SearchInBST {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode tmpNode = queue.poll();
			if (tmpNode.val == val) {
				return tmpNode;
			}
			if (tmpNode.left != null) {
				queue.offer(tmpNode.left);
			}
			if (tmpNode.right != null) {
				queue.offer(tmpNode.right);
			}
		}

		return null;
	}


	// 利用二叉搜索树的特性解问题
	// 递归法
	public TreeNode searchBST1(TreeNode root, int val) {
		if (root == null || root.val == val) {
			return root;
		}
		if (val < root.val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}

	// 迭代法
	public TreeNode searchBST2(TreeNode root, int val) {
		while (root != null) {
			if (val < root.val) {
				root = root.left;
			} else if (val > root.val) {
				root = root.right;
			} else {
				return root;
			}
		}
		return null;
	}
}
