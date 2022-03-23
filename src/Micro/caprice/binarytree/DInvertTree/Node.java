package Micro.caprice.binarytree.DInvertTree;

import java.util.List;

/**
 * @program Before2020
 * @description: 节点
 * @author: ding
 * @create: 2022/03/11 01:24
 */
public class Node {
	public int val;
	public List<Node> children;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}
