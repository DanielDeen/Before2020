package Micro.caprice.binarytree.FMaxMinDepth;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 111.二叉树的最小深度
 * @author: ding
 * @create: 2022/03/27 01:22
 */
public class MinDepth {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int depth = 0;
		while (!queue.isEmpty()){
			depth++;
			int len = queue.size();
			while (len > 0) {
				TreeNode tmpNode = queue.poll();
				if (tmpNode.left == null && tmpNode.right == null) {
					return depth;
				}

				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				len--;
			}
		}
		return depth;
	}
}
