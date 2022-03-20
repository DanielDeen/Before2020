package Micro.caprice.binarytree.CLevelTraversal;

/**
 * @program Before2020
 * @description: node
 * @author: ding
 * @create: 2022/03/21 00:28
 */
public class BinaryNode {
	public int val;
	public BinaryNode left;
	public BinaryNode right;
	public BinaryNode next;

	public BinaryNode() {}

	public BinaryNode(int _val) {
		val = _val;
	}

	public BinaryNode(int _val, BinaryNode _left, BinaryNode _right, BinaryNode _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
}
