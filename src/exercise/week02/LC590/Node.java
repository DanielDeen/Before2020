package exercise.week02.LC590;

import java.util.List;

/**
 * @description: N叉树节点
 * @author: Daniel Deen
 * @create: 2020-11-01 22:13
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
