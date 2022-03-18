package Micro.caprice.binarytree.BUnifyTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 中序遍历--统一写法
 * @author: ding
 * @create: 2022/03/19 01:30
 */
public class InOrder {
	public List<Integer> inOrder(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) {
			stack.push(root);
		}

		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();
			if (node != null) {
				stack.pop();
				if (node.right != null) {
					stack.push(node.right);
				}
				stack.push(node);
				stack.push(null);

				if (node.left!= null) {
					stack.push(node.left);
				}

			} else {
				stack.pop();

				node = stack.peek();
				stack.pop();
				list.add(node.val);
			}
		}

		return list;
	}
}
