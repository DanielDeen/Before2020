package Micro.caprice.binarytree.MMaxTree;

/**
 * @program Before2020
 * @description: 654. 最大二叉树
 * @author: ding
 * @create: 2022/04/01 23:50
 */
public class MaxBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums, 0, nums.length);
	}


	private TreeNode helper(int[] num, int start, int end) {
		if (start >= end) {
			return null;
		}

		int maxIndex = start;
		for (int i = start; i < end; i++) {
			if (num[i] > num[maxIndex]) {
				maxIndex = i;
			}
		}

		TreeNode root = new TreeNode(num[maxIndex]);
		root.left = helper(num, start, maxIndex);
		root.right = helper(num, maxIndex + 1, end);
		return root;
	}
}
