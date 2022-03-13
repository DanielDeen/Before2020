package Micro.caprice.binarytree.CRecursiveTraversal2;

import java.util.*;

/**
 * @program Before2020
 * @description: 后序遍历--迭代法
 * @author: ding
 * @create: 2022/03/14 00:27
 */
public class PostOrder {
	public List<Integer> postOrder(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			if (node.left != null) {
				stack.push(node.left);
			}
			if (node.right != null) {
				stack.push(node.right);
			}
		}
		Collections.reverse(list);
		return list;
	}
}
