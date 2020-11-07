package exercise.week02.LC144;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树的前序遍历
 * @author: Daniel Deen
 * @create: 2020-11-01 21:59
 */

public class LC144S1 {
    /**
     *  递归经典模板：（前序）
     *  res.add(root.val)
     *  inorder(root.left)
     *  inorder(root.right)
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);

        return res;
    }

    public static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}
