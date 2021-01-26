package exercise.week15.LC1457;

/**
 * @description: treenode
 * @author: Daniel Deen
 * @create: 2021-01-26 01:27
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
