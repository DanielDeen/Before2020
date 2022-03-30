package Micro.caprice.binarytree.KPathSum;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 113. 路径总和 II
 * @author: ding
 * @create: 2022/03/30 22:23
 */
public class PathSum {
	List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return res;
		}
		List<Integer> list = new ArrayList<>();
		list.add(root.val);
		traversal(root, targetSum-root.val, list);
		return res;
	}

	private void traversal(TreeNode node, int count, List<Integer> list) {
		if (node.left == null && node.right == null && count == 0) {
			res.add(new ArrayList<>(list));
			return;
		}

		if (node.left != null) {
			list.add(node.left.val);
			traversal(node.left, count - node.left.val, list);
			list.remove(list.size() - 1);
		}

		if (node.right != null) {
			list.add(node.right.val);
			traversal(node.right, count - node.right.val, list);
			list.remove(list.size() - 1);
		}
	}
}
