package Micro.caprice.binarytree.CLevelTraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 111. 二叉树的最小深度
 * @author: ding
 * @create: 2022/03/22 00:57
 */
public class MinDepth {
	public int minDepth(TreeNode root) {
		int depth = 0;

		Queue<TreeNode> queue = new LinkedList<>();
		if (root != null) {
			queue.add(root);
		}
		while (!queue.isEmpty()) {
			int len = queue.size();
			depth++;
			while (len > 0) {
				TreeNode tempNode = queue.poll();
				if (tempNode.right == null && tempNode.left == null) {
					return depth;
				}
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
				len--;
			}
		}

		return depth;
	}
}
