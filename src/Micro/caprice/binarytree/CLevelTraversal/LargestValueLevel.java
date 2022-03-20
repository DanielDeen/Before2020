package Micro.caprice.binarytree.CLevelTraversal;

import java.util.*;

/**
 * @program Before2020
 * @description: 515. 在每个树行中找最大值
 * @author: ding
 * @create: 2022/03/21 00:22
 */
public class LargestValueLevel {
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int len = queue.size();
			int levelMin = Integer.MIN_VALUE;
			while (len > 0) {
				TreeNode tmpNode = queue.poll();
				levelMin = Math.max(levelMin, tmpNode.val);
				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				len--;
			}
			list.add(levelMin);
		}

		return list;
	}
}
