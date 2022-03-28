package Micro.caprice.binarytree.ESymmetricTree;

/**
 * @program Before2020
 * @description: 100. 相同的树
 * @author: ding
 * @create: 2022/03/29 00:41
 */
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		if (q == null || p == null || p.val != q.val) {
			return false;
		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
