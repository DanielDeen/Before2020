package LookOffer.day07;

/**
 * @program Before2020
 * @description: 剑指 Offer 26. 树的子结构
 * @author: ding
 * @create: 2021/12/29 23:15
 */
public class IsSubStructure {
	private boolean flag = false;
	public boolean isSubStructure(TreeNode A, TreeNode B) {
		return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
	}
	boolean recur(TreeNode A, TreeNode B) {
		if(B == null) {
			return true;
		}
		if(A == null || A.val != B.val) {
			return false;
		}
		return recur(A.left, B.left) && recur(A.right, B.right);
	}

}
