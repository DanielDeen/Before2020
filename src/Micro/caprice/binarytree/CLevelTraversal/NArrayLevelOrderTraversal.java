package Micro.caprice.binarytree.CLevelTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 429. N叉树的层序遍历
 * @author: ding
 * @create: 2022/03/21 00:16
 */
public class NArrayLevelOrderTraversal {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int len = queue.size();
			List<Integer> child = new ArrayList<>();
			while (len > 0) {
				Node tmpNode = queue.poll();
				child.add(tmpNode.val);
				if (tmpNode.children.size() > 0) {
					queue.addAll(tmpNode.children);
				}
				len--;
			}
			list.add(child);
		}

		return list;
	}
}
