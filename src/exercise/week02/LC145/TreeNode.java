package exercise.week02.LC145;

/**
 * @description: 树节点
 * @author: Daniel Deen
 * @create: 2020-11-01 21:45
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
