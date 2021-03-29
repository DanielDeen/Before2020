package Job.week04;

import Job.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 173.二叉搜索树迭代器
 * @author: Daniel Deen
 * @create: 2021-03-28 23:32
 */

public class LC173S1 {
    private int index;
    private List<Integer> list;


    public LC173S1(TreeNode root) {
        index = 0;
        list = new ArrayList<>();
        inorderTraversal(root, list);
    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    public int next() {
        return list.get(index++);
    }

    public boolean hasNext() {
        return index < list.size();
    }
}
