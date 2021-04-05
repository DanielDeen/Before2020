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
        ListNode dummyNode = head;
        int index = 1;
        while (dummyNode.next != null) {
            dummyNode = dummyNode.next;
            index++;
        }
        int step = index - k % index;
        if (step == index) return head;
        dummyNode.next = head;
        while (step--> 0) {
            dummyNode = dummyNode.next;
        }
        ListNode res = dummyNode.next;
        dummyNode.next = null;
        return res;
    }
}
