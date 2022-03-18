package Micro.caprice.binarytree.BUnifyTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 前序迭代--统一写法
 * @author: ding
 * @create: 2022/03/19 01:20
 */
public class PreOrder {
	public List<Integer> preOrderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) {
			stack.push(root);
		}

		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();
			stack.pop();
			if (node != null) {
				if (node.right != null) {
					stack.push(node.right);
				}
				if (node.left != null) {
					stack.push(node.left);
				}
				stack.push(node);
				stack.push(null);
			} else {
				node = stack.peek();
				stack.pop();
				list.add(node.val);
			}
		}
		return list;
	}
}
