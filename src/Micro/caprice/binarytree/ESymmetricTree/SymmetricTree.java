package Micro.caprice.binarytree.ESymmetricTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 101. 对称二叉树
 * @author: ding
 * @create: 2022/03/24 00:00
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int len = queue.size();
			int left = 0;
			int right = queue.size() - 1;
			List<Integer> list = new ArrayList<>();
			while (len > 0) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				len--;
			}
			while (left <= right) {
				if (list.get(left) != list.get(right)) {
					return false;
				}
				left++;
				right--;
			}
		}
		return true;
	}
}
