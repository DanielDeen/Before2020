package Micro.caprice.binarytree.NMergeTree;

/**
 * @program Before2020
 * @description: 节点
 * @author: ding
 * @create: 2022/03/11 01:24
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode() {
	}
}
