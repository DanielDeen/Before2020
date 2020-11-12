package exercise.week03.LC111;

/**
 * @description: 二叉树的最小深度
 * @author: Daniel Deen
 * @create: 2020-11-10 00:53
 */

public class LC111S1 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMin = minDepth(root.left);
        int rightMin = minDepth(root.right);

        return (leftMin == 0 || rightMin == 0) ? leftMin + rightMin + 1
                : Math.min(leftMin, rightMin) + 1;
    }
}
