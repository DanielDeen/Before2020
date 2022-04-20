package Micro.caprice.binarytree.OSearchTree;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 108. 将有序数组转换为二叉搜索树
 * @author: ding
 * @create: 2022/04/20 23:07
 */
public class CovertToBST {
	public static void main(String[] args) {
		System.out.println(new CovertToBST().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
	}


	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		int mid = len >> 1;

		TreeNode root = new TreeNode(nums[mid]);
		if (mid > 0) {
			int[] leftArray = new int[mid];
			System.arraycopy(nums, 0, leftArray, 0, leftArray.length);
			root.left = sortedArrayToBST(leftArray);
			if (mid + 1 < len) {
				int[] rightArray = new int[len - mid - 1];
				System.arraycopy(nums, mid + 1, rightArray, 0, rightArray.length);
				root.right = sortedArrayToBST(rightArray);
			}

		}
		return root;
	}


	public TreeNode sortedArrayToBST1(int[] nums) {
		return sort(nums, 0, nums.length);
	}

	private TreeNode sort(int[] nums, int left, int right) {
		if (left >= right) {
			return null;
		}
		int mid = left + ((right - left) >> 1);
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sort(nums, left, mid);
		root.right = sort(nums, mid + 1, right);
		return root;
	}
}
