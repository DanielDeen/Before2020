package Micro.caprice.binarytree.CRecursiveTraversal2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program Before2020
 * @description: 中序遍历--迭代法
 * @author: ding
 * @create: 2022/03/14 00:17
 */
public class InOrder {
	public List<Integer> inorder(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<>();

		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				cur = stack.pop();
				list.add(cur.val);
				cur = cur.right;
			}
		}

		return list;
	}
}
