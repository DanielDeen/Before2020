package exercise.week10.LC103;

import org.omg.PortableInterceptor.INACTIVE;

import java.time.chrono.MinguoDate;
import java.util.*;

/**
 * @description: 103.二叉树的锯齿形层序遍历
 * @author: Daniel Deen
 * @create: 2020-12-22 00:13
 */

public class LC103S1 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0, m = queue.size(); i < m; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (((index & 1) == 1)) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
            }
            res.add(list);
            index++;
        }
        return res;
    }
}
