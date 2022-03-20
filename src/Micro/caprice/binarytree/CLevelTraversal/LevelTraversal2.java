package Micro.caprice.binarytree.CLevelTraversal;

import java.util.*;

/**
 * @program Before2020
 * @description: 107.二叉树的层序遍历2
 * @author: ding
 * @create: 2022/03/19 23:48
 */
public class LevelTraversal2 {
	List<List<Integer>> list = new ArrayList<>();

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		traversal(root);

		Collections.reverse(list);
		return list;
	}

	private void traversal(TreeNode node) {
		if (node == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			List<Integer> tmpList = new ArrayList<>();
			int len = queue.size();
			while (len > 0) {
				TreeNode tmpNode = queue.poll();
				tmpList.add(tmpNode.val);

				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				len--;
			}
			list.add(tmpList);
		}

	}

	private void traversal(TreeNode node, int deep) {
		if (node == null) {
			return;
		}

		deep++;
		if (list.size() < deep) {
			list.add(new ArrayList<>());
		}

		list.get(deep - 1).add(node.val);
		if (node.left != null) {
			traversal(node.left, deep);
		}

		if (node.right != null) {
			traversal(node.right, deep);
		}
	}

}
