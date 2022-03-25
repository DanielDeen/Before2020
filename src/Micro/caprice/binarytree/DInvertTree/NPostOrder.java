package Micro.caprice.binarytree.DInvertTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program Before2020
 * @description: 590. N 叉树的后序遍历
 * @author: ding
 * @create: 2022/03/23 23:58
 */
public class NPostOrder {
	List<Integer> list = new ArrayList<>();

	public List<Integer> postorder(Node root) {
		if (root == null) {
			return list;
		}

		for (Node node : root.children) {
			postorder(node);
		}
		list.add(root.val);

		return list;
	}
}
