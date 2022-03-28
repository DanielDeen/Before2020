package Micro.caprice.binarytree.IAllPathTree;

import java.util.*;

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
			String leafPath = path + "->" + node.val;
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


	// 递归法
	public List<String> binaryTreePaths1(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		List<String> res = new ArrayList<>();

		if (root == null) {
			return res;
		}

		traversal(root, list, res);

		return res;
	}

	private void traversal(TreeNode node, List<Integer> list, List<String> res) {
		list.add(node.val);
		if (node.left == null && node.right == null) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				if (i == list.size() - 1) {
					sb.append(list.get(i));
				} else {
					sb.append(list.get(i)).append("->");
				}
			}
			res.add(sb.toString());
		}

		if (node.left != null) {
			traversal(node.left, list, res);
			list.remove(list.size() - 1);
		}
		if (node.right != null) {
			traversal(node.right, list, res);
			list.remove(list.size() - 1);
		}
	}

	// 迭代法
	public List<String> binaryTreePaths2(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		Queue<String> queueString = new LinkedList<>();
		queueString.offer(String.valueOf(root.val));
		List<String> list = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode tmpNode = queue.poll();
			String tmpPath = queueString.poll();
			if (tmpNode.left == null && tmpNode.right == null) {
				list.add(tmpPath);
			}

			if (tmpNode.left != null) {
				queue.offer(tmpNode.left);
				queueString.offer(tmpPath + "->" + tmpNode.left.val);
			}
			if (tmpNode.right != null) {
				queue.offer(tmpNode.right);
				queueString.offer(tmpPath + "->" + tmpNode.right.val);
			}

		}
		return list;
	}
}
