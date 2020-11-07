package exercise.week03.JZ068;

/**
 * @description: 二叉树的最近公共祖先
 * @author: Daniel Deen
 * @create: 2020-11-06 21:58
 */

public class JZ068S1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode right = lowestCommonAncestor(root.right, p , q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        if (left == null) return right;
        if (right == null) return left;

        return root;
    }
}
