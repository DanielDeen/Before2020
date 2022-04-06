package Micro.caprice.binarytree.OSearchTree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @program Before2020
 * @description: 501. 二叉搜索树中的众数
 * @author: ding
 * @create: 2022/04/06 23:12
 */
public class ModeInTree {
	public int[] findMode(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<>();
		traversal(root, map);
		Collections.sort(map.entrySet(),(v1, v2)-> {
			return v1-v2;
		});
	}
}
