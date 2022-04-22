package Micro.caprice.binarytree.OSearchTree;

/**
 * @program Before2020
 * @description: 538.把二叉搜索树转换为累加树
 * @author: ding
 * @create: 2022/04/20 23:51
 */
public class CovertToGreaterSumTree {
	int sum;
	public TreeNode convertBST(TreeNode root) {
		// 反中序遍历累加
		sum = 0;
		covert(root);
		return root;
	}

	private void covert(TreeNode root) {
		if (root == null){
			return;
		}

		covert(root.right);
		sum += root.val;
		root.val = sum;
		covert(root.left);
	}


}
