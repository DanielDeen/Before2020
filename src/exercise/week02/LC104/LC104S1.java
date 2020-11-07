package exercise.week02.LC104;

/**
 * @description: 二叉树的最大深度
 * @author: Daniel Deen
 * @create: 2020-10-31 23:09
 */

public class LC104S1 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int res1 = 1;
        int res2 = 1;
        res1 += maxDepth(root.right);
        res2 += maxDepth(root.left);
        return Math.max(res1, res2);
    }
}
