package exercise.week02.LC094;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树的中序遍历
 * @author: Daniel Deen
 * @create: 2020-11-01 21:44
 */
public class LC094S1 {
    /**
     *  递归经典模板：（中序）
     *  inorder(root.left)
     *  res.add(root.val)
     *  inorder(root.right)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);

        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
