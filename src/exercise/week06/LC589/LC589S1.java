package exercise.week06.LC589;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 589.N叉数的前序遍历
 * @author: Daniel Deen
 * @create: 2020-11-26 22:34
 */

public class LC589S1 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return list;
        list.add(root.val);
        List<Node> clist = root.children;
        for (int i = 0; i < clist.size(); i++) {
            preorder(clist.get(i));
        }
        return list;
    }

    private void prePath(Node root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        for (Node node : root.children) {
            prePath(node, list);
        }
    }
}
