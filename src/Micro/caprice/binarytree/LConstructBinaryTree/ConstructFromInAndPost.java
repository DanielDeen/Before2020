package Micro.caprice.binarytree.LConstructBinaryTree;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 106. 从中序与后序遍历序列构造二叉树
 * @author: ding
 * @create: 2022/03/30 23:35
 */
public class ConstructFromInAndPost {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return traversal(inorder, 0, inorder.length, postorder, 0, postorder.length);
	}

	private TreeNode traversal(int[] inorder, int inorderLeft, int inorderRight, int[] postorder, int postorderLeft, int postorderRight) {
		if (inorderRight - inorderLeft < 1) {
			return null;
		}


		int rootValue = postorder[postorderRight - 1];
		TreeNode treeNode = new TreeNode(rootValue);

		if (inorderRight - inorderLeft == 1) {
			return treeNode;
		}

		int delimiterIndex;
		for (delimiterIndex = 0; delimiterIndex < inorder.length; delimiterIndex++) {
			if (inorder[delimiterIndex] == rootValue) {
				break;
			}
		}

		treeNode.left = traversal(inorder, inorderLeft, delimiterIndex, postorder, postorderLeft, postorderLeft + delimiterIndex - inorderLeft);
		treeNode.right = traversal(inorder, delimiterIndex + 1, inorderRight, postorder, postorderLeft+ delimiterIndex - inorderLeft, postorderRight - 1);

		return treeNode;
	}

}
