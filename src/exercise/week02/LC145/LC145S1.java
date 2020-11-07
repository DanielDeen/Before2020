package exercise.week02.LC145;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树的后序遍历
 * @author: Daniel Deen
 * @create: 2020-11-01 22:06
 */

public class LC145S1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);

        return res;
    }

    private void postOrder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }
}
