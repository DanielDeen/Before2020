package LookOffer.day07;

/**
 * @program Before2020
 * @description: 剑指 Offer 28. 对称的二叉树
 * @author: ding
 * @create: 2021/12/29 23:18
 */
public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
		return root == null ? true : recur(root.left, root.right);
	}

	boolean recur(TreeNode L, TreeNode R) {
		if (L == null && R == null) {
			return true;
		}
		if (L == null || R == null || L.val != R.val) {
			return false;
		}
		return recur(L.left, R.right) && recur(L.right, R.left);
	}

}
