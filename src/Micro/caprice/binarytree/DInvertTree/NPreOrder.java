package Micro.caprice.binarytree.DInvertTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 589. N 叉树的前序遍历
 * @author: ding
 * @create: 2022/03/23 23:50
 */
public class NPreOrder {
	List<Integer> list = new ArrayList<>();

	public List<Integer> preorder(Node root) {
		if (root == null) {
			return list;
		}
		list.add(root.val);
		for (Node node : root.children) {
			preorder(node);
		}
		return list;
	}
}
