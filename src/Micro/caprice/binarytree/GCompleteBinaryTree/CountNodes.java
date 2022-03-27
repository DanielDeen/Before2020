package Micro.caprice.binarytree.GCompleteBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 222.完全二叉树的节点个数
 * @author: ding
 * @create: 2022/03/27 22:51
 */
public class CountNodes {
	public int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int num = 0;
		while (!queue.isEmpty()) {
			int len = queue.size();
			while (len > 0) {
				TreeNode node = queue.poll();
				num++;
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				len--;
			}
		}
		return num;
	}


	int num = 0;

	public int countNodes1(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left != null) {
			countNodes1(root.left);
			num++;
		}
		if (root.right != null) {
			countNodes1(root.right);
			num++;
		}

		return num;
	}

	public int countNodes2(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);

		if (leftDepth == rightDepth) {
			return (1<<leftDepth) + countNodes2(root.right);
		} else {
			return  (1<<rightDepth) + countNodes2(root.left);
		}
	}

	private int getDepth(TreeNode node) {
		int depth = 0;
		while (node != null) {
			node = node.left;
			depth++;
		}
		return depth;
	}
}
