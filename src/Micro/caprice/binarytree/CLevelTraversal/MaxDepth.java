package Micro.caprice.binarytree.CLevelTraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 104. 二叉树的最大深度
 * @author: ding
 * @create: 2022/03/22 00:51
 */
public class MaxDepth {
	public int maxDepth(TreeNode root) {
		int depth = 0;

		Queue<TreeNode> queue = new LinkedList<>();
		if (root != null ) {
			queue.add(root);
		}
		while (!queue.isEmpty()) {
			int len = queue.size();
			while (len > 0) {
				TreeNode tempNode = queue.poll();
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
				len--;
			}
			depth++;
		}

		return depth;
	}
}
