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
	public List<List<Integer>> levelOrder(Node1 root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Queue<Node1> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int len = queue.size();
			List<Integer> child = new ArrayList<>();
			while (len > 0) {
				Node1 tmpNode1 = queue.poll();
				child.add(tmpNode1.val);
				if (tmpNode1.children.size() > 0) {
					queue.addAll(tmpNode1.children);
				}
				len--;
			}
			list.add(child);
		}

		return list;
	}
}
