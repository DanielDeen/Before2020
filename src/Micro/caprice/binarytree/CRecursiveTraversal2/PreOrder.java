package Micro.caprice.binarytree.CRecursiveTraversal2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 前序遍历--迭代法
 * @author: ding
 * @create: 2022/03/12 06:41
 */
public class PreOrder {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
		}
		return list;
	}

}
