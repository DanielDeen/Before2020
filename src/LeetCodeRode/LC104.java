package LeetCodeRode;

/**
 * @description: 二叉树的最大深度
 * @author: Daniel Deen
 * @create: 2020-10-14 23:08
 */

public class LC104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode rootl = new TreeNode(9);
        TreeNode rootr = new TreeNode(20);
        TreeNode rootrl = new TreeNode(15);
        TreeNode rootrr = new TreeNode(7);


        root.left = rootl;
        root.right = rootr;
        rootr.left = rootrl;
        rootr.right = rootrr;

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDep = maxDepth(root.left);
        int rightDep = maxDepth(root.right);

        return Math.max(leftDep, rightDep) + 1;
    }


}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}
