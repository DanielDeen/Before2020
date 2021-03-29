package Job.week04;

import Job.ListNode;

import java.util.List;

/**
 * @description: 61.旋转链表
 * @author: Daniel Deen
 * @create: 2021-03-27 18:58
 */

public class LC061S1 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode newListNode = new ListNode(-1);
        newListNode.next = head;
        ListNode dummyNode = newListNode;
        int index = 0;
        while (head != null) {
            dummyNode.next = head;
            dummyNode = dummyNode.next;
            head = head.next;
            index++;
        }
        dummyNode.next = newListNode.next;
        int rem = index % k;
        for (int i = 0; i < rem; i++) {
            dummyNode = dummyNode.next;
        }
        dummyNode.next = null;

        return newListNode.next;
    }
}
