package Micro.caprice.binarytree.CLevelTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 637. 二叉树的层平局值
 * @author: ding
 * @create: 2022/03/21 00:01
 */
public class AverageOfLevel {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {
			int len = queue.size();
			int len1 = queue.size();
			double sum = 0;
			while (len > 0) {
				TreeNode tmpNode = queue.poll();
				if (tmpNode.left != null) {
					queue.add(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.add(tmpNode.right);
				}
				sum += tmpNode.val;
				len--;
			}
			list.add((sum / len1));
		}

		return list;
	}
}
