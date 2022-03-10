package Micro.caprice.binarytree.BRecursiveTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 144. 二叉树的前序遍历
 * @author: ding
 * @create: 2022/03/11 01:23
 */
public class PreTraversal {
	public static void main(String[] args) {

	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traversal(root, list);
		return list;
	}

	private void traversal(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}

		list.add(root.val);
		traversal(root.left, list);
		traversal(root.right, list);
	}

}
