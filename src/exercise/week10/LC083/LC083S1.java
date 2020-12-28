package exercise.week10.LC083;

/**
 * @description: 83.删除排序链表中的重复元素
 * @author: Daniel Deen
 * @create: 2020-12-21 23:35
 */

public class LC083S1 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode tempNode = dummyNode.next;
        while (tempNode.next != null) {
            int cur = tempNode.val;
            if (tempNode.next.val == cur) {
                tempNode.next = tempNode.next.next;
            } else {
                tempNode = tempNode.next;
            }
        }

        return dummyNode.next;
    }
}
