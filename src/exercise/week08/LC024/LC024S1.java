package exercise.week08.LC024;

/**
 * @description: 24.两两交换链表中的节点
 * @author: Daniel Deen
 * @create: 2020-12-11 23:21
 */

public class LC024S1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode tempNode = dummyNode;
        while (tempNode.next != null && tempNode.next.next != null) {
            ListNode first = tempNode.next;
            ListNode second = tempNode.next.next;

            tempNode.next = second;
            first.next = second.next;
            second.next = first;

            tempNode = first;

        }

        return dummyNode.next;
    }
}
