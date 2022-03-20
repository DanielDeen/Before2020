package Micro.caprice.binarytree.CLevelTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 102.二叉树的层序遍历
 * @author: ding
 * @create: 2022/03/19 21:37
 */
public class LevelTraversal {
	List<List<Integer>> list = new ArrayList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		traversal1(root, 0);
		return list;
	}

	// 递归法
	public void traversal1(TreeNode node, Integer deep) {
		if (node == null) {
			return;
		}

		deep++;
		if (list.size() < deep) {
			list.add(new ArrayList<>());
		}

		list.get(deep - 1).add(node.val);
		traversal1(node.left, deep);
		traversal1(node.right, deep);
	}

	// 借助队列迭代
	public void traversal2(TreeNode root) {
		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);


		while (!queue.isEmpty()) {
			List<Integer> listItem = new ArrayList<>();
			int len = queue.size();

			while (len > 0) {
				TreeNode tmpNode = queue.poll();
				listItem.add(tmpNode.val);

				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}

				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				len--;
			}

			list.add(listItem);
		}


	}
}
