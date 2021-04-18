package Job.week04;

import Job.TreeNode;

/**
 * @description: 783.二叉搜索树节点最小距离
 * @author: Daniel Deen
 * @create: 2021-04-13 23:13
 */

public class LC783S1 {
    int pre;
    int index;

    public int minDiffInBST(TreeNode root) {
        pre = -1;
        index = Integer.MAX_VALUE;
        dfs(root);
        return index;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != -1) {
            index = Math.min(root.val - pre, index);
        }
        pre = root.val;
        dfs(root.right);
    }
}
