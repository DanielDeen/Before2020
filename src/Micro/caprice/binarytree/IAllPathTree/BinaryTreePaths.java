package Micro.caprice.binarytree.IAllPathTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 257. 二叉树的所有路径
 * @author: ding
 * @create: 2022/03/28 23:16
 */
public class BinaryTreePaths {
	List<String> list = new ArrayList<>();

	public List<String> binaryTreePaths(TreeNode root) {
		if (root.left == null && root.right == null) {
			list.add(String.valueOf(root.val));
		}

		if (root.left != null) {
			findPath(String.valueOf(root.val), root.left);
		}
		if (root.right != null) {
			findPath(String.valueOf(root.val), root.right);
		}

		return list;
	}

	private void findPath(String path, TreeNode node) {
		if (node.left == null && node.right == null) {
			String leafPath = path +"->" + node.val;
			list.add(leafPath);
			return;
		}

		if (node.left != null) {
			String leftPath = path + "->" + node.val;
			findPath(leftPath, node.left);
		}
		if (node.right != null) {
			String rightPath = path + "->" + node.val;
			findPath(rightPath, node.right);
		}
	}
}
