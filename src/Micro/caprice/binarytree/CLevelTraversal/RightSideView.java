package Micro.caprice.binarytree.CLevelTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 199. 二叉树的右视图
 * @author: ding
 * @create: 2022/03/20 23:00
 */
public class RightSideView {

	public static void main(String[] args) {
		List<Integer> tmp = new ArrayList<>();
		tmp.add(1);
		tmp.add(3);
		tmp.add(4);
		tmp.add(5);
		System.out.println(tmp.toString());

		tmp.add(1,2);
		System.out.println(tmp.toString());
	}

	List<Integer> list = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode root) {
		traversal(root, 0);
		return list;
	}

	private void traversal(TreeNode node, int deep) {
		if (node == null) {
			return;
		}

		deep++;
		if (list.size() < deep) {
			list.add(deep - 1, node.val);
		}

		if (node.left != null) {
			traversal(node.left, deep);
		}

		if (node.right != null) {
			traversal(node.right, deep);
		}

	}

	private void traversal(TreeNode node) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			int len = queue.size();
			while (len > 0) {
				TreeNode tempNode = queue.poll();
				if (tempNode.left != null) {
					queue.offer(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.offer(tempNode.right);
				}
				if (len == 1) {
					list.add(tempNode.val);
				}
				len--;
			}
		}
	}
}
