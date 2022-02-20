package LookOffer.day07;

/**
 * @program Before2020
 * @description: 剑指 Offer 27. 二叉树的镜像
 * @author: ding
 * @create: 2021/12/29 23:19
 */
public class MirrorTree {
	public TreeNode mirrorTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = mirrorTree(root.left);
		TreeNode right = mirrorTree(root.right);
		root.left = right;
		root.right = left;
		return root;
	}
}
