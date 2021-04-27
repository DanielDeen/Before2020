package Job.week05;

import Job.TreeNode;

/**
 * @description: 897.递增顺序搜索树
 * @author: Daniel Deen
 * @create: 2021-04-25 23:00
 */

public class LC897S1 {
    TreeNode resNode;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);

        resNode.right = root;
        root.left = null;
        resNode = root;

        inorder(root.right);
    }
}
