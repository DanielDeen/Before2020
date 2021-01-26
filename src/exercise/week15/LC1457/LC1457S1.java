package exercise.week15.LC1457;

/**
 * @description: 1457.二叉树中的伪回文路径
 * @author: Daniel Deen
 * @create: 2021-01-26 01:27
 */

public class LC1457S1 {
    int ans;

    public int pseudoPalindromicPaths(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode root, int temp) {
        int n = temp ^ (1 << root.val);
        if (root.left == null && root.right == null) {
            if (n == 0 || (n & (n - 1)) == 0) {
                ans++;
            }
            return;
        }
        if (root.left != null) {
            dfs(root.left, n);
        }
        if (root.right != null) {
            dfs(root.right, n);
        }
    }
}
