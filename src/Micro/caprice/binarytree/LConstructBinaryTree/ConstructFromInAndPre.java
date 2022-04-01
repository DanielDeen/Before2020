package Micro.caprice.binarytree.LConstructBinaryTree;

/**
 * @program Before2020
 * @description: 105. 从前序与中序遍历序列构造二叉树
 * @author: ding
 * @create: 2022/04/01 02:36
 */
public class ConstructFromInAndPre {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}

	private TreeNode helper(int[] preOrder, int preLeft, int preRight, int[] inOrder, int inLeft, int inRight) {
		if (inLeft > inRight || preLeft > preRight) {
			return null;
		}


		int idx = inLeft;
		int val = preOrder[preLeft];
		TreeNode root = new TreeNode(val);
		for (int i = inLeft; i <= inRight; i++) {
			if (inOrder[i] == val) {
				idx = i;
				break;
			}
		}

		root.left = helper(preOrder, preLeft + 1, preLeft + idx - inLeft, inOrder, inLeft, idx - 1);
		root.right = helper(preOrder, preLeft + idx - inLeft + 1, preRight, inOrder, idx + 1, inRight);

		return root;
	}
}
