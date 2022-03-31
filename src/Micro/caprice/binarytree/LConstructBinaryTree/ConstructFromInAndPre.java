package Micro.caprice.binarytree.LConstructBinaryTree;

/**
 * @program Before2020
 * @description: 105. 从前序与中序遍历序列构造二叉树
 * @author: ding
 * @create: 2022/04/01 02:36
 */
public class ConstructFromInAndPre {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return helper(0, 0, inorder.length - 1, preorder, inorder);
	}
}
