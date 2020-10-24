package exercise.week01.LC024;

/**
 * @description: 两两交换链表中的节点
 * @author: Daniel Deen
 * @create: 2020-10-23 22:56
 */

public class LC024S2 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode temp = dummyNode;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;


            node1.next = node2.next;
            temp.next = node2;
            node2.next = node1;

            temp = node1;

        }
        return dummyNode.next;
    }
}
