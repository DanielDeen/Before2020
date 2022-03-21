package Micro.caprice.binarytree.CLevelTraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program Before2020
 * @description: 116. 填充每个节点的下一个右侧节点指针
 * @author: ding
 * @create: 2022/03/21 00:28
 */
public class ConnectNodeRight {
	public Node connect(Node root) {
		if (root == null) {
			return root;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int len = queue.size();
			while (len > 0) {
				Node tmpNode = queue.poll();
				if (len >1) {
					tmpNode.next = queue.peek();
				}

				if (tmpNode.left != null) {
					queue.add(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.add(tmpNode.right);
				}

				len--;
			}
		}
		return root;
	}
}
