package exercise.week03.LC226;

/**
 * @description: 反转二叉树
 * @author: Daniel Deen
 * @create: 2020-11-03 00:52
 */

public class LC226S1 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
