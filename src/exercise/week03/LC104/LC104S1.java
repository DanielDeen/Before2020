package exercise.week03.LC104;

/**
 * @description: 二叉树的最大深度
 * @author: Daniel Deen
 * @create: 2020-11-10 00:49
 */

public class LC104S1 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftRes = 1;
        int rightRes = 1;
        leftRes += maxDepth(root.left);
        rightRes += maxDepth(root.right);

        return Math.max(leftRes, rightRes);
    }
}
