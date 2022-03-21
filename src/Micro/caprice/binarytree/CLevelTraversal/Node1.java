package Micro.caprice.binarytree.CLevelTraversal;

import java.util.List;

/**
 * @program Before2020
 * @description: Node
 * @author: ding
 * @create: 2022/03/21 00:16
 */
public class Node1 {
	public int val;
	public List<Node1> children;

	public Node1() {}

	public Node1(int _val) {
		val = _val;
	}

	public Node1(int _val, List<Node1> _children) {
		val = _val;
		children = _children;
	}
}
