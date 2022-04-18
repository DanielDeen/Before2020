package Micro.caprice.binarytree.OSearchTree;

/**
 * @program Before2020
 * @description: 450. 删除二叉搜索树中的节点
 * @author: ding
 * @create: 2022/04/16 23:10
 */
public class DelNodeInBST {
	/**
	 * 1、没有找到节点，知己恩返回空
	 * 2、找到节点
	 * 1）左右孩子都为空，直接删除节点，返回NULL为根节点
	 * 2）删除节点的左节点为空，右孩子不为空，删除节点，右孩子补位，返回右孩子为根节点
	 * 3）删除节点的右节点为空，左还在不为空，删除节点，左孩子补位，返回左孩子为根节点
	 * 4）左右孩子节点都不为空，则将删除节点的左子树头节点（左孩子）放到删除节点的右子树
	 * 的最左面节点的左孩子上，返回删除节点有右孩子为新的根节点
	 */

	// 通用版本
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return root;
		}

		if (root.val == key) {
			if (root.right == null) {
				return root.left;
			}

			TreeNode node = root.right;
			while (node.left != null) {
				node = node.left;
			}
			root.val = node.val;
			root.right = deleteNode(root.right, node.val);
		}

		root.left = deleteNode(root.left, key);
		root.right = deleteNode(root.right, key);

		return root;
	}


	public TreeNode deleteNode1(TreeNode root, int key) {
		if (root == null) {
			return root;
		}
		if (root.val > key) {
			root.left = deleteNode1(root.left, key);
		} else if (root.val < key) {
			root.right = deleteNode1(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			}
			if (root.right == null) {
				return root.left;
			}

			TreeNode node = root.right;
			if (node.left != null) {
				node = node.left;
			}
			root.val = node.val;
			root.right = deleteNode1(root.right, node.val);
		}
		return root;
	}
}
