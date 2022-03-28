package Micro.caprice.binarytree.ESymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 572. 另一棵树的子树
 * @author: ding
 * @create: 2022/03/29 00:50
 */
public class SubTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode tmpNode = queue.poll();
			if (isSame(tmpNode, subRoot)) {
				return true;
			}
			if (tmpNode.left != null) {
				queue.offer(tmpNode.left);
			}
			if (tmpNode.right != null) {
				queue.offer(tmpNode.right);
			}
		}
		return false;
	}

	private boolean isSame(TreeNode p, TreeNode q) {
		if (p == null || q == null || p.val != q.val) {
			return false;
		}
		return isSame(p.left, q.left) && isSame(q.right, p.right);
	}
}
