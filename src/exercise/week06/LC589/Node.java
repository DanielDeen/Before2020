package exercise.week06.LC589;

import java.util.List;

/**
 * @description: 树节点
 * @author: Daniel Deen
 * @create: 2020-11-26 22:34
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
