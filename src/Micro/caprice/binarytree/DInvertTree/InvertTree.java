package Micro.caprice.binarytree.DInvertTree;

import java.util.Stack;

/**
 * @program Before2020
 * @description: 226.翻转二叉树
 * @author: ding
 * @create: 2022/03/22 22:17
 */
public class InvertTree {
	public TreeNode1 invertTree(TreeNode1 root) {
		if (root == null) {
			return null;
		}

		TreeNode1 left = invertTree(root.left);
		TreeNode1 right = invertTree(root.right);

		root.left = right;
		root.right = left;

		return root;
	}

	public TreeNode1 invertTree1(TreeNode1 root) {
		if (root == null) {
			return null;
		}

		Stack<TreeNode1> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode1 tmpNode = stack.pop();
			swap(tmpNode);
			if (tmpNode.right != null) {
				stack.push(tmpNode.right);
			}
			if (tmpNode.left != null) {
				stack.push(tmpNode.left);
			}
		}
		return root;
	}

	private void swap(TreeNode1 node) {
		TreeNode1 tmpNode = node.left;
		node.left = node.right;
		node.right = tmpNode;
	}

}
