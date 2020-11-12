package exercise.week03.LC098;

/**
 * @description: 验证二叉搜索树
 * @author: Daniel Deen
 * @create: 2020-11-10 00:30
 */

public class LC098S1 {
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean validBST(TreeNode root, long maxValue, long minValue) {
        if (root == null) return true;
        if (root.val >= maxValue || root.val <= minValue) return false;
        return validBST(root.left, root.val, minValue) && validBST(root.right, maxValue, root.val);
    }
}
