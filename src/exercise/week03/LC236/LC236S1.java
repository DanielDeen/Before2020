package exercise.week03.LC236;

/**
 * @description: 二叉树的最近公共祖先
 * @author: Daniel Deen
 * @create: 2020-11-08 09:49
 */

public class LC236S1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        if(right == null) return left;
        if (left == null) return right;

        return root;
    }
}
