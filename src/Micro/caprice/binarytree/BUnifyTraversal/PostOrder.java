package Micro.caprice.binarytree.BUnifyTraversal;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 后序遍历--统一
 * @author: ding
 * @create: 2022/03/19 01:40
 */
public class PostOrder {
	public List<Integer> postOrder(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();

		if (root != null) {
			stack.push(root);
		}


		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();
			if (node != null) {
				stack.pop();
				stack.push(node);
				stack.push(null);

				if (node.right != null) {
					stack.push(node.right);
				}

				if (node.left != null) {
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
