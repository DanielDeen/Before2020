package exercise.Topic.week07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description: 102.二叉树的层序遍历
 * @author: Daniel Deen
 * @create: 2020-12-08 01:08
 */

public class LC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> lst = new ArrayList<>();
            for (int i = 0, size = queue.size(); i < size; i++){
                TreeNode tmp = queue.poll();
                lst.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            res.add(lst);
        }
        return res;
    }
}
