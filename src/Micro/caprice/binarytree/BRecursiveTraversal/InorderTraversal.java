package Micro.caprice.binarytree.BRecursiveTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 94.二叉树的中序遍历
 * @author: ding
 * @create: 2022/03/11 01:32
 */
public class InorderTraversal {
	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<>();
		traversal(root, list);
		return list;
	}

	private void traversal(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}

		traversal(root.left, list);
		list.add(root.val);
		traversal(root.right, list);
	}

}
