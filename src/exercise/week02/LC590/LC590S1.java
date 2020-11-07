package exercise.week02.LC590;

import exercise.week02.LC589.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: N叉树的后序遍历
 * @author: Daniel Deen
 * @create: 2020-11-01 22:24
 */

public class LC590S1 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    public void postOrder(Node root, List<Integer> res) {
        if (root == null) return;
        for (Node node: root.children) {
            postOrder(node, res);
        }
        res.add(root.val);
    }
}
