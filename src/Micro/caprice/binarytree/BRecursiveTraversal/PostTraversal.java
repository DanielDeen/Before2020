package Micro.caprice.binarytree.BRecursiveTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 145.二叉树的后序遍历
 * @author: ding
 * @create: 2022/03/11 01:29
 */
public class PostTraversal {
	public static void main(String[] args) {

	}

	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<>();
		traversal(root, list);
		return list;
	}

	private void traversal(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}

		traversal(root.left, list);
		traversal(root.right, list);
		list.add(root.val);
	}


}
